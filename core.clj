(ns clojure-355.core
  (:gen-class))

;; QUESTIONS:
;; defn vs. def?
;; How to compile / run in terminal?

(def greeting "hello world")

;; Call with (add 1 2) // res: 3
(def add (fn [x y] (+ x y)))

(defn add1 [x y] (+ x y))

;; fac 0 = 1
;; fac n = n * fac (n-1)

;; Call with (fac 5) // res: 120
(defn fac [x]
  (if (== x 0)
  1
  (* x (fac (- x 1)))))

;; Call with (incAll [1 2 3]) // res: (2 3 4)
(defn incAll [x]
  (map inc x))

;; Assignment 1 in CLJ
(defn my-odd? [x]
  (not) (zero? (mod x 2)))

;; Call with (dropList 2 '(1 2 3 4)) // res: (3 4)
(defn dropList [n lst]
  (if (or (<= n 0) (empty? lst))
    lst
    (dropList (dec n) (rest lst))))

;; Call with (sumSquareOdds '(1 2 3 4)) // res: 10
(defn sumSquareOdds [lst]
  (reduce + 
    (map 
      (fn [x] (* x x))
      (filter odd? lst))))

;; Call with (sumSquareOdds1 '(1 2 3 4)) // res: 10
(defn summSquareOdds1 [lst]
  (->> lst ;; Thread last operator (->>) passes the result of the previous expression as the last argument of the next expression
    (filter odd?)
    (map #(* % %)) ;; #() is a shorthand for anonymous function % is the argument
    (reduce +)))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))
