;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(println

(reduce
  (fn [sum nr]
    (if (or
      (= 0 (mod nr 3))
      (= 0 (mod nr 5)))
        (+ sum nr)
        sum))
  0
  (take 1000 (iterate inc 0)))
)
