; A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
; Find the largest palindrome made from the product of two 3-digit numbers.

(defn palyndrome?
  [nr]
  (= (str nr) (clojure.string/join (reverse (str nr)))))

(println
  (apply max
    (filter palyndrome?
      (reduce
        (fn [coll nr]
          (into coll (map #(* nr %) (range 100 999))))
        []
        (range 100 999)))))
