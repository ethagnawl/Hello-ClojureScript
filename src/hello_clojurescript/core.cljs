(ns hello_clojurescript.core
  (:use [jayq.core :only [$]]))

(def MyModel (.extend Backbone.Model))

(def MyView
  (.extend Backbone.View
    (js-obj
      "template" (.template js/_ "<%= message %>")

      "initialize" (fn []
                     (this-as this
                       (.render this)))
      "render"  (fn []
                  (this-as this
                    (.html this.$el
                      (.template this this.model.attributes)))))))

(def my-model
  (MyModel.
    (js-obj
      "message" "Hello, World!")))

(def my-view
  (MyView.
    (js-obj
      "el" ($ :#wrapper)
      "model" my-model)))
