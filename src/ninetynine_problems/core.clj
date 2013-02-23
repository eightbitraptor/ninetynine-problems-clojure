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

(defn no-in
  ([args] (no-in args 0))
  ([args result]
   (if (empty? args)
     result
     (no-in (rest args) (inc result)))))

(defn flip-it
  ([args] (flip-it args '()))
  ([args result]
   (if (empty? args)
     result
     (flip-it (rest args) (cons (first args) result)))))

(defn palindrome? [list]
  (= (flip-it list) list))

(defn my-flatten [args]
  (cond 
    (not (list? args)) (list args)
    (empty? args) args
    :else (concat (my-flatten (first args)) 
                  (my-flatten (rest args)))))
