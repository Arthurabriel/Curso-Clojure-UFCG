(require '[clojure.string :as str])

(defn ini-vogais [palavras]
  (filter (fn [palavra]
            (let [primeiraLetra (str/lower-case (subs palavra 0 1))]
              (contains? #{"a" ,"e" ,"i" ,"o" ,"u"} primeiraLetra))) palavras))


(assert (= (ini-vogais '("Abacaxi" "Uva" "Banana" "Laranja" "Maçã")) '("Abacaxi" "Uva")))
(assert (= (ini-vogais '("Laranja" "Abóbora" "Cenoura" "Melancia")) '("Abóbora")))
(assert (= (ini-vogais '("Elefante" "Urso" "Iguana" "Ornitorrinco")) '("Elefante" "Urso" "Iguana" "Ornitorrinco")))
(assert (= (ini-vogais '("alface" "cachorro" "elefante" "igreja")) '("alface" "elefante" "igreja")))
