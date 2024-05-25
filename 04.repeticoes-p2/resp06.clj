(defn soma-quadrados [lista]
  (let [lista-quadrados (map (fn [x] (* x x)) lista)]
    (reduce + lista-quadrados)))

(assert(= (soma-quadrados '(4 2 1)) 21))
(assert(= (soma-quadrados '(5 4 10)) 141))
(assert(= (soma-quadrados '(5 3 1))  35))
(assert(= (soma-quadrados '()) 0))
