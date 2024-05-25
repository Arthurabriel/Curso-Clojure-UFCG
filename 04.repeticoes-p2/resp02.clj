(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
  (let[primeiro (first lista)] 
    (cons (* primeiro primeiro) (quadrados-rec (rest lista))))))


(assert(= (quadrados-rec '(3 2 1)) '(9 4 1)))
(assert(= (quadrados-rec '(5 4 10)) '(25 16 100)))
(assert(= (quadrados-rec '()) '()))
