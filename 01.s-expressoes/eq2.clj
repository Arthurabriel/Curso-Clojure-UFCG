(defn delta [a b c] (- (* b b) (* 4 a c)))

(defn raizes [a b c] (if (< (delta a b c) 0) "Sem raizes" (if (= (delta a b c) 0) [(/ (- b) (* 2 a))] ([(/ (+ (- b) (Math/sqrt (delta a b c))) (* 2 a))
                                                                                                                  (/ (- (- b) (Math/sqrt delta a b c)) (* 2 a))]))))

(defn -main []
    (println "Digite o coeficiente a:")
      (flush)
        (def a (Integer/parseInt (read-line)))

          (println "Digite o coeficiente b:")
            (flush)
              (def b (Integer/parseInt (read-line)))

                (println "Digite o coeficiente c:")
                  (flush)
                    (def c (Integer/parseInt (read-line)))
                    (println (raizes a b c)))

(-main)
