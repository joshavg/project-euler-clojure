;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143 ?

(defn divisors-until
  [nr]
  (range 2 (/ nr 2.0)))

(defn is-prime?
  [nr]
  (if (or (< nr 2) (= nr 4))
    false
    (= 0
      (count
        (filter
          (fn
            [div]
            (= 0 (mod nr div)))
          (divisors-until nr)))
    )
  )
)

(defn prime-factors
  [nr]
  )

(println (filter is-prime? (range 20)))

;(defn prime-factors
;  [nr]
;  (reduce 
