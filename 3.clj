;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143 ?

(defn divisors-until
  [nr]
  (range 2 (/ nr 2.0)))

(defn divisible?
  [nr div]
  (= 0 (mod nr div)))

(defn prime?
  [nr]
  (println "prime?" nr)
  (if (or (< nr 2) (= nr 4))
    false
    (= 0
      (count
        (filter
          (fn
            [div]
            (divisible? nr div))
          (divisors-until nr))))))

(defn primes-until
  [nr]
  (filter prime? (range nr)))

(defn prime-factors
  [nr]
  (let [primes (primes-until (/ nr 2.0))]  
    (filter (fn [chk] (println "divisible" nr chk) (divisible? nr chk))
      (reverse primes)))
)

;(println (first-prime-factor 13195))
(println (first (reverse (prime-factors 600851475143))))
