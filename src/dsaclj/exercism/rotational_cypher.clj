(ns dsaclj.exercism.rotational-cypher)

(def minor-letter? #(and (>= % 97) (<= % 122)))
(def major-letter? #(and (>= % 65) (<= % 90)))
(defn rotate-int [r c]
  (let [c (int c)
        rotated-char (+ c r)
        max-char (cond
                   (major-letter? c) 90
                   (minor-letter? c) 122
                   :else nil)]
    (char (cond
            (-> max-char nil?) c
            (> rotated-char max-char) (- rotated-char 26)
            :else rotated-char))))

(defn rotate
  [base r]
  (apply str (map (partial rotate-int (mod r 26)) (char-array base))))
