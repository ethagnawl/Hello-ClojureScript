(defproject hello_clojurescript "0.1.0-SNAPSHOT"
  :description "FIXME: write this!"
  :url "http://example.com/FIXME"

  :dependencies [[org.clojure/clojure "1.6.0"]
                 [org.clojure/clojurescript "0.0-2311"]
                 [jayq "2.5.2"]]

  :plugins [[lein-cljsbuild "1.0.4-SNAPSHOT"]]

  :source-paths ["src"]

  :cljsbuild {
    :builds [{:id "hello_clojurescript"
              :source-paths ["src"]
              :compiler {
                :output-to "out/hello_clojurescript.js"
                :output-dir "out"
                :optimizations :whitespace}}]})
