;By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
;What is the 10 001st prime number?

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

(println
  (loop [ix 0 nr 0]
    (cond
      (and (= ix 10001) (prime? nr)) nr
      (prime? nr) (recur (inc ix) (inc nr))
      true (recur ix (inc nr)))))
