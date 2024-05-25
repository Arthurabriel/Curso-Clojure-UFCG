(defn length [lista]
    (if (empty? lista)
     0
    (+ 1 (length (rest lista)))))

;; Testes para a função length
(assert (= 0 (length ())))
(assert (= 3 (length '(1 2 3))))
(assert (= 5 (length '(a b c d e))))
(assert (= 7 (length (range 7))))


(defn value_at [i lista]
    (if (= i 0)
      (first lista)
      (value_at (- i 1) (rest lista))))


;; Testes para a função value_at
(assert (= 1 (value_at 0 '(1 2 3))))
(assert (= 3 (value_at 2 '(1 2 3 4 5))))
(assert (= 'd (value_at 3 '(a b c d e))))
(assert (= 'e (value_at 4 '(a b c d e))))

(defn index [v lista]
  (loop [i 0 sequencia lista]
    (cond
      (empty? sequencia) -1
      (= v (first sequencia)) i
    :else (recur (inc i) (rest sequencia)))))


;; Testes para a função index
(assert (= 2 (index 'c '(a b c d e))))
(assert (= 0 (index 1 '(1 2 3 1 2))))
(assert (= 3 (index 4 '(1 2 3 4 5))))
(assert (= -1 (index 'x '(a b c d e))))
