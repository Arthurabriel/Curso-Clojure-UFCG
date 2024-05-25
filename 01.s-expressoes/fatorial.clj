(defn fatorial [n] (if (= n 1) 1  (* n (fatorial (- n 1N)))))


(defn -main [& args]
  (println "Digite um numero: ")
  (flush)
  (def n (Integer/parseInt (read-line)))
  (print "o fatorial de " n " é: " (fatorial n)))

(-main)
