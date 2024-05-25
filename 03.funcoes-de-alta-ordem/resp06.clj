(defn fahr-celsius [temperaturas]
  (map (fn [fahr] (* (/ (- fahr 32) 9) 5)) temperaturas))


(assert (= (fahr-celsius [32 68 104]) '(0 20 40)))
(assert (= (fahr-celsius [212 98.6]) '(100 37.0)))
(assert (= (fahr-celsius [5]) '(-15)))
(assert (= (fahr-celsius []) '()))
