(ns ninetynine-problems.core-test
  (:use midje.sweet)
  (:use ninetynine-problems.core))

;; 99 - find the last element
(fact (my-last '(:A :B :C :D)) => :D)

;; 98 - find the penultimate element
(fact (my-but-last '(:A :B :C :D)) => '(:C :D))

