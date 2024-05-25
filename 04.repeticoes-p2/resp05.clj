(defn quadrados-rec [lista]
  (if (empty? lista)
    '()
  (let[primeiro (first lista)]
    (cons (* primeiro primeiro) (quadrados-rec (rest lista))))))

(defn soma-quadrados [lista]
  (if (empty? lista)
    0
    (apply + (quadrados-rec lista))))
(assert(= (soma-quadrados '(4 2 1)) 21))
(assert(= (soma-quadrados '(5 4 10)) 141))
(assert(= (soma-quadrados '(5 3 1))  35))
(assert(= (soma-quadrados '()) 0))


