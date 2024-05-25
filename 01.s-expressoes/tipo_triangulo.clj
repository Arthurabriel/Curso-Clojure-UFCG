(defn tipo_triangulo [a b c]
    (cond (and (= a b) (= b c)) :equilatero
          (or (= a b) (= b c) (= c a)) :isosceles
          :else :escaleno))


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
                     (println "O triângulo é do tipo: " (tipo_triangulo a b c)))
(-main)
