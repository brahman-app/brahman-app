(ns brahman-pasture-calculator.core-test
  (:
    [cljs.test :refer-macros [deftest is testing run-tests]]
    [brahman-pasture-calculator.core :as bpc.core]))

(deftest test-average-weight
  (is (= (bpc.core/calc-avg-weight 1200 1600) 1400)))

(deftest test-animal-unit
  (is (= bpc.core/animal-unit 1000)))

(deftest test-animal-unit-equivalent
  (is (= (bpc.core/calc-animal-unit-equivalent 1400) 1.4)))

(deftest test-total-animal-units
  (is (= (bpc.core/calc-total-animal-units 100 1.4) 140)))

(deftest test-calc-pasture-size
  (is (= (bpc.core/calc-pasture-size 140 4 1.0) 560)))

