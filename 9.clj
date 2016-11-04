;A Pythagorean triplet is a set of three natural numbers, a < b < c, for which,
;a² + b² = c²
;For example, 3² + 4² = 9 + 16 = 25 = 5².
;There exists exactly one Pythagorean triplet for which a + b + c = 1000.
;Find the product abc.

(def not-nil? (complement nil?))

(def a-b-tuples
  (reduce
    (fn [res nr]
      (concat res (map (fn [nr2]
        [nr nr2])
        (range 2 (- 1000 nr)))))
    []
    (range 1 999)))

(loop [[a b] (first a-b-tuples)
       rest-tuples (rest a-b-tuples)]
  (let [c (- 1000 a b)
        asqr (* a a)
        bsqr (* b b)
        csqr (* c c)]
    (if (= (+ asqr bsqr) csqr)
      (println "found" (* a b c) a b c)
      (when (not-nil? rest-tuples)
        (recur
          (first rest-tuples)
          (rest rest-tuples))))))

