(ns dsaclj.trees.binarysearchtree
  (:gen-class))

(defrecord Node [value left right])

(defn insert
  [value tree]
  (if (= tree nil)
    (->Node value nil nil)
    (if (< value (:value tree))
      (->Node (:value tree) (insert value (:left tree)) (:right tree))
      (if (> value (:value tree))
        (->Node (:value tree) (:left tree) (insert value (:right tree)))
        (tree)))))
