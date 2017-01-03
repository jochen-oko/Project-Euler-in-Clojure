(ns euler.001-test
  (:require [clojure.test :refer :all]
            [euler.001 :refer :all]))


(deftest test-countMultiplesUntil
  (testing "Test building the sum over all dividers"
      (is (= (countMultiplesUntil 10 [3]) 18))
      (is (= (countMultiplesUntil 10 [3 5]) 23))
      (is (= (countMultiplesUntil 1000 [3 5]) 233168))
      ))

(deftest test-finding-multiple
  (testing "Test multiple"
    (is (multiple? 9 3))
    (is (multiple? 1 1))
    (is (multiple? 10 5))


    (is not (multiple? 10 3))
    (is not (multiple? 10 -1))
    (is not (multiple? 10 0))))

(deftest test-finding-multiples
  (testing "Test multiples(!)"
    (is not (multiples? 1 [3 5]))
    (is not (multiples? 2 [3 5]))
    (is (multiples? 3 [3 5]))
    (is not (multiples? 4 [3 5]))
    (is (multiples? 5 [3 5]))
    (is (multiples? 6 [3 5]))
    (is not (multiples? 7 [3 5]))
    (is not (multiples? 8 [3 5]))
    (is (multiples? 9 [3 5]))
    (is (multiples? 1 [1]))
    (is (multiples? 10 [5]))
    (is (multiples? 15 [3 5]))
    (is not (multiples? 10 [3]))
    (is not (multiples? 10 [-1]))
    (is not (multiples? 10 [0]))))
