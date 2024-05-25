(defn conta ([n] (println n) (conta (inc n))) ([] (conta 0)))

(conta)
