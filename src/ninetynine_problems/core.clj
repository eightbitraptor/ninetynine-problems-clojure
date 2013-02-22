(ns ninetynine-problems.core)

(defn my-last [args]
  (if (empty? (rest args))
    (first args)
    (my-last (rest args))))

(defn my-but-last [args]
  (if (= 1 (count (rest args)))
    args
    (my-but-last (rest args))))

(defn element-at [args idx]
  (if (= 1 idx)
    (first args)
    (element-at (rest args) (dec idx))))
