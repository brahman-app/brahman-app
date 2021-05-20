(ns ^:figwheel-hooks brahman-pasture-calculator.core
  (:require
    [reagent.core :as r]
    [reagent.dom :as r.dom]))

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

(defn app []
  [:h1.site__title
    [:span.site__title-text "Brahman Pasture Calculator"]])

(defn mount []
  (r.dom/render [app] (js/document.getElementById "root")))

(defn ^:after-load re-render []
  (mount))

(defonce start-up (do (mount) true))
