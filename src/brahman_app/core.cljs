(ns brahman-app.core
  (:require
    [reagent.core :as r]
    [reagent.dom :as rdom]
    [reagent.react-native :as rn]))

;; Calculate average weight of the cattle
(defn calc-avg-weight [min-weight max-weight]
    (/ (+ min-weight max-weight) 2))

;; Define Animal Unit (AU)
(def animal-unit 1000)

;; Average weight of a Bull
(def bull-weight (r/atom (calc-avg-weight 1600 2200)))

;; Average weight of a Cow
(def cow-weight (r/atom (calc-avg-weight 1000 1400)))

;; Calculate Animal Unit Equivalent (AUE)
(defn calc-animal-unit-equivalent [avg-weight]
    (/ avg-weight animal-unit))

;; Calculate Total Animal Units (AU)
(defn calc-total-animal-units [herd-size animal-unit-equivalent]
  (* herd-size animal-unit-equivalent))

;; Calculate Pasture Size
(defn calc-pasture-size [animal-units grazing-season stocking-rate]
  (/ (* animal-units grazing-season) stocking-rate))

;;(let [bulls 50
;;      cows  50]
;;  (defn brahman-app []
;;    [:div
;;      [:h3 "Pasture Calculator"]
;;      [:div
;;        "Bulls: " (int bulls) "Cows: " (int cows)
;;       [:input {:type "range" :min 0 :max 255}]]]))

(defn brahman-app[]
  [rn/view {:style {:flex 1 :align-items "center" :justify-content "center"}}
   [rn/text {:style {:font-size 50}} "Pasture Calculator"]])

(defn ^:export -main [& args]
  (r/as-element [brahman-app]))

