;The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
;Find the sum of all the primes below two million.

(defn prime?
  [nr]
  (if (or (= nr 2) (= nr 3))
    true
    (if (or (= nr 1) (= nr 4))
      false
      (nil?
        (some true?
          (map #(= 0 (mod nr %))
            (range 2 (Math/sqrt (+ nr 1)))))))))

(def target 2000000)

(println
  (reduce (fn [sum nr]
    (+ sum (if (prime? nr) nr 0)))
    0
    (range 2 target)))
