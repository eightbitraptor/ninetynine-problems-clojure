(ns ninetynine-problems.core-test
  (:use midje.sweet)
  (:use ninetynine-problems.core))

;; 01 - find the last element
(fact (my-last '(a b c d)) => 'd)

;; 02 - find the penultimate element
(fact (my-but-last '(a b c d)) => '(c d))

;; 03 - find the nth element of a list
(fact (element-at '(a b c d e f) 3) => 'c)

;; 04 - find the number of elements of a list
(fact (no-in '(a b c d e) 0) => 5)
