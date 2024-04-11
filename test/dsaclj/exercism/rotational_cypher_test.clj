(ns dsaclj.exercism.rotational-cypher-test
  (:require [clojure.test :as test]
            [dsaclj.exercism.rotational-cypher :as rc]))

(test/deftest zero-sort-test
  (test/testing "Bubble Sort: Sorting zero items array"
    (test/is (= "a" (rc/rotate "a" 0)))
    (test/is (= "b" (rc/rotate "a" 27)))
    (test/is (= "z" (rc/rotate "m" 13)))
    (test/is (= "Gzo'n zvo, Bmviyhv!" (rc/rotate "Let's eat, Grandma!" 21)))))
