(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
  (let[primeiro (first lista)]
    (cons (* primeiro primeiro) (quadrados-rec (rest lista))))))


(defn quadrados-pares [lista]
        (let [lista-pares (filter (fn [x] (even? x)) lista)]
          (quadrados-rec lista-pares)))

(assert(= (quadrados-pares '(4 2 1)) '(16 4 )))
(assert(= (quadrados-pares '(5 4 10)) '(16 100)))
(assert(= (quadrados-pares '(5 3 1)) '()))

