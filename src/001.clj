
;; Solution for Problem 01 from Project Euler (https://projecteuler.net/problem=1)
;; If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9.
;; The sum of these multiples is 23.
;; Find the sum of all the multiples of 3 or 5 below 1000.

(ns euler.001)

(defn multiple?
  [n divider]
  (and (> divider 0) (= (rem n divider) 0)))

(defn multiples?
  [n dividers]
  (reduce #(or %1 %2) (map #(multiple? n %) dividers)))

(defn countMultiplesUntil
  [n dividers]
  (->> (range n) (filter #(multiples? % dividers)) (reduce +)))


(defn -main
  [& args]
  (println (countMultiplesUntil 1000 [3 5])))
