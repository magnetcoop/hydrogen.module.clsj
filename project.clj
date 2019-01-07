(defproject duct/module.cljs "0.4.0"
  :description "Duct module for developing and compiling ClojureScript"
  :url "https://github.com/duct-framework/module.cljs"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [org.clojure/clojurescript "1.10.439"]
                 [binaryage/devtools "0.9.10"]
                 [duct/core "0.7.0"]
                 [duct/compiler.cljs "0.3.0"]
                 [duct/server.figwheel "0.3.0"]
                 [integrant "0.7.0"]])
