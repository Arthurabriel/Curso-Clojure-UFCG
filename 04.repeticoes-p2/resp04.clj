(defn quadrados-pares-rec [lista]
  (let [primeiro (first lista)]
    (cond 
      (empty? lista) '()
      (even? primeiro) (cons (* primeiro primeiro) (quadrados-pares-rec (rest lista)))
      :else (quadrados-pares-rec (rest lista)))))



(assert(= (quadrados-pares-rec '(4 2 1)) '(16 4)))
(assert(= (quadrados-pares-rec '(5 4 10)) '(16 100)))
(assert(= (quadrados-pares-rec '(5 3 1)) '()))


