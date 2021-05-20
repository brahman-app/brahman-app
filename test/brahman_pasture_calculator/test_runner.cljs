;; This test runner is intended to be run from the command line
(ns brahman-pasture-calculator.test-runner
  (:require
    [brahman-pasture-calculator.core-test]))

(defn -main [& args]
  (run-tests))

