;The following iterative sequence is defined for the set of positive integers:
;n → n/2 (n is even)
;n → 3n + 1 (n is odd)
;Using the rule above and starting with 13, we generate the following sequence:
;13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1
;It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.
;Which starting number, under one million, produces the longest chain?
;NOTE: Once the chain starts the terms are allowed to go above one million.

(defn collatz-seq
  [n]
  (loop [i n lst [n]]
    (cond
      (= i 1) lst
      (even? i) (recur
        (/ i 2)
        (conj lst (/ i 2)))
      true (recur
        (+ 1 (* 3 i))
        (conj lst (+ 1 (* 3 i)))))))

(println
  (loop [i 1 mxl 0 mxn 1]
    (let [size (count (collatz-seq i))
          newmxl (if (> size mxl) size mxl)
          newmxn (if (> size mxl) i mxn)]
      (if (> i 999999)
        mxn
        (recur
          (inc i)
          newmxl
          newmxn)))))
