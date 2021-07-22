(ns brahman-app.core-test
  (:require
    [cljs.test :refer-macros [deftest is testing run-tests]]
    [brahman-app.core]))

(deftest test-average-weight
  (is (= (brahman-app.core/calc-avg-weight 1200 1600) 1400)))

(deftest test-animal-unit
  (is (= brahman-app.core/animal-unit 1000)))

(deftest test-animal-unit-equivalent
  (is (= (brahman-app.core/calc-animal-unit-equivalent 1400) 1.4)))

(deftest test-total-animal-units
  (is (= (brahman-app.core/calc-total-animal-units 100 1.4) 140)))

(deftest test-calc-pasture-size
  (is (= (brahman-app.core/calc-pasture-size 140 4 1.0) 560)))

