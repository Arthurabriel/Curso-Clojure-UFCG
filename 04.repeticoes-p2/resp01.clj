(defn quadrados [lista]
  (map (fn [x] (* x x)) lista))


(assert(= (quadrados '(3 2 1)) '(9 4 1)))
(assert(= (quadrados '(5 4 10)) '(25 16 100)))
(assert(= (quadrados '()) '()))

          
