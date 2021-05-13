(ns ^:figwheel-hooks oxr463.brahman-pasture-calculator)

(defn ^:after-load re-render[]
 (js/console.log "Moo!")
