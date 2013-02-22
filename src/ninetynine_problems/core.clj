(ns ninetynine-problems.core)

(defn my-last [args]
  (if (empty? (rest args))
    (first args)
    (my-last (rest args))))
