(ns dsaclj.trees.binarysearchtree-test
  (:require [dsaclj.trees.binarysearchtree :as bst]
            [clojure.test :as test]))

(test/deftest simple-insert-test
  (test/testing "Binary search tree: one element"
    (let [t (bst/insert 1 nil)]
      (test/is (= t (bst/->Node 1 nil nil))))))

(test/deftest multiple-insert-test
  (test/testing "Binary search tree: multiple elements"
    (let
     [t (bst/insert 0 (bst/insert 2 (bst/insert 1 nil)))]
      (test/is (= t (bst/->Node 1 (bst/->Node 0 nil nil) (bst/->Node 2 nil nil)))))))