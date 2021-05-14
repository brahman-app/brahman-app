(ns ^:figwheel-hooks oxr463.brahman-pasture-calculator
  (:require
    [reagent.dom :as r.dom]))

(defn app []
  [:h1.site__title
    [:span.site__title-text "Brahman Pasture Calculator"]]])

(defn mount []
  (r.dom/render [app] (js/document.getElementById "root")))

(defn ^:after-load re-render []
  (mount))

(defonce start-up (do (mount) true))
