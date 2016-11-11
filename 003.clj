;The prime factors of 13195 are 5, 7, 13 and 29.
;What is the largest prime factor of the number 600851475143 ?

(defn divisible?
  [nr div]
  (zero? (rem nr div)))

(defn max-prime-factor
  [nr]
  (let [max-check (long (Math/sqrt nr))]
    (loop [div 2 rest-div nr]
      (cond
        (> div max-check) rest-div
        (= div rest-div) rest-div
        (divisible? rest-div div) (recur div (/ rest-div div))
        true (recur (inc div) rest-div)
      )))
)

(println (max-prime-factor 600851475143))
