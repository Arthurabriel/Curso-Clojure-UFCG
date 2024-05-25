(defn contar_limitado [limite] (doseq [n (range (inc limite))] (println n)))


(println "Digite um inteiro:")
(flush)
(def limite (Integer/parseInt (read-line)))

(contar_limitado limite)
