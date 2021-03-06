;symbolically simplify boolean disjunctions

(defn simplify-or [l]
  (let [newl (remove false? l)]
  (let [newl2 (nthrest newl 1)]

  (if (some true? newl2)
    true
    (if (empty? newl2)
    false
    (if (=(count newl2) 1)
    (last newl2)
    newl))))))
