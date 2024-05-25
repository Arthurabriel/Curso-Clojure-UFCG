(defn eh_triangulo [a b c] (and (> (+ a b) c) (> (+ b c) a) (> (+ a c) b)))

(defn -main [& args]
    (println "Digite o lado A do triângulo:")
      (flush)
        (def a (Integer/parseInt (read-line)))

          (println "Digite o lado B do triângulo:")
            (flush)
              (def b (Integer/parseInt (read-line)))

                (println "Digite o lado C do triângulo:")
                  (flush)
                    (def c (Integer/parseInt (read-line)))

                      (if (eh_triangulo a b c)
                            (println "É um triângulo válido.")
                                (println "Não é um triângulo válido.")))

(-main)
