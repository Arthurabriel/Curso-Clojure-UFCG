(defn eh_bissexto [ano]
    (if (= (mod ano 400) 0) true (if (and (= (mod ano 4)0) (not (= (mod ano 100) 0))) true false)))

(defn -main [& args]
    (println "Digite um ano:")
      (flush)
        (def ano (Integer/parseInt (read-line)))

          (if (eh_bissexto ano)
                (println ano "é um ano bissexto.")
                    (println ano "não é um ano bissexto.")))

(-main)
