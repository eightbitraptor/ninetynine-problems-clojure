(ns ninetynine-problems.core-test
  (:use midje.sweet)
  (:use ninetynine-problems.core))

(fact (my-last '(:A :B :C :D)) => :D)
