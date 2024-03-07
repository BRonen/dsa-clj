(ns dsaclj.sortings.bubblesort
  (:gen-class))

(defn bubblesort [in]
  (if (< (count in) 2)
    in
    (if (<= (first in) (second in))
      (concat [(first in)] (bubblesort (rest in)))
      (bubblesort (concat [(second in)] (bubblesort (concat [(first in)] (rest (rest in)))))))))
