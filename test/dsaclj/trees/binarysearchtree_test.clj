(ns dsaclj.trees.binarysearchtree-test
  (:require [dsaclj.trees.binarysearchtree :as bst]
            [clojure.test :refer :all]))

(deftest simple-insert-test
  (testing "Create tree: one element"
    (let [t (bst/insert 1 nil)]
      (is (= t (bst/->Node 1 nil nil))))))

(deftest multiple-insert-test
  (testing "Create tree: multiple elements"
    (let
     [t (bst/insert 0 (bst/insert 2 (bst/insert 1 nil)))]
      (is (= t (bst/->Node 1 (bst/->Node 0 nil nil) (bst/->Node 2 nil nil)))))))