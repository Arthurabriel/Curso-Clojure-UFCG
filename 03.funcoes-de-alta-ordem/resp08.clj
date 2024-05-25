(defn soma-quadrados-de-pares [lista]
    (reduce + (map(fn [y] (* y y)) (filter (fn [x] (even? x)) lista))))

(assert (= (soma-quadrados-de-pares [1 2 3 4 5]) 20)) 
(assert (= (soma-quadrados-de-pares [2 4 6 8]) 120)) 
(assert (= (soma-quadrados-de-pares [1 3 5 7 9]) 0)) 
(assert (= (soma-quadrados-de-pares []) 0)) 
(assert (= (soma-quadrados-de-pares [2]) 4))
(assert (= (soma-quadrados-de-pares [1 4 7 8 10]) 180))
