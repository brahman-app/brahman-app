(ns ^:figwheel-hooks brahman-pasture-calculator.core
  (:require
    [reagent.core :as r]
    [reagent.dom :as r.dom]))

;; Calculate average weight of the cattle
(defn calc-avg-weight [{:keys [min-weight max-weight] :as data}]
    (assoc data :avg-weight (/ (+ min-weight max-weight) 2)))

;; Calculate Animal Unit Equivalent (AUE)
(defn calc-aue [avg-weight]
  (def au 1000)
    (/ avg-weight au))

;; Calculate Total Animal Units (AU)
(defn calc-total-au [herd-size aue]
  (* herd-size aue))

;; Calculate Pasture Size
(defn calc-pasture-size [aus grazing-time stocking-rate]
  (/ (* aus grazing-time) stocking-rate))

;; Typical weight of a Bull
(def bull-data (r/atom (calc-avg-weight {:min-weight 1600 :max-weight 2200})))

;; Typical weight of a Cow
(def cow-data (r/atom (calc-avg-weight {:min-weight 1000 :max-weight 1400})))

(defn app []
  [:h1.site__title
    [:span.site__title-text "Brahman Pasture Calculator"]])

(defn mount []
  (r.dom/render [app] (js/document.getElementById "root")))

(defn ^:after-load re-render []
  (mount))

(defonce start-up (do (mount) true))
