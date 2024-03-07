(ns dsaclj.sortings.bubblesort-test
  (:require [clojure.test :as test]
           [dsaclj.sortings.bubblesort :refer [bubblesort]]))

(test/deftest zero-sort-test
  (test/testing "Bubble Sort: Sorting zero items array"
    (let [in []
          out []]
      (test/is (= out (bubblesort in))))))

(test/deftest one-sort-test
  (test/testing "Bubble Sort: Sorting one items array"
    (let [in [4]
          out [4]]
      (test/is (= out (bubblesort in))))))

(test/deftest two-sort-test
  (test/testing "Bubble Sort: Sorting two items array"
    (let [in [4, 2]
          out [2, 4]]
      (test/is (= out (bubblesort in))))))

(test/deftest three-sort-test
  (test/testing "Bubble Sort: Sorting three items array"
    (let [in [5, 4, 2]
          out [2, 4, 5]]
      (test/is (= out (bubblesort in))))))

(test/deftest sort-test
  (test/testing "Bubble Sort: Sorting small array"
    (let [in [5, 4, 2, 7, 1, 6, 8, 3]
          out [1, 2, 3, 4, 5, 6, 7, 8]]
      (test/is (= out (bubblesort in))))))
