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

;; 05 - reverse the contents of a list
(fact (flip-it '(1 2 3)) => '(3 2 1))

;; 06 - palindromes
(fact (palindrome? '(a b b a)) => true)
(fact (palindrome? '(a b c d)) => false)

;; 07 - flatten the nested list
(fact (my-flatten '(a (b (c d) e))) => '(a b c d e))

;; 08 - eliminate consecutive duplicates
(fact (compress '(a a a b b c c c c d d d)) => '(a b c d))
