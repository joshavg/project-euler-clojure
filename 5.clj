;2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
;What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?

(defn divisible?
  [nr div]
  (zero? (rem nr div)))

(loop [nr 20]
  (if (some #(not (divisible? nr %)) (range 1 20))
    (recur (inc nr))
    (println nr)))
