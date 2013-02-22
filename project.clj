(defproject ninetynine-problems "0.1.0-SNAPSHOT"
            :description "FIXME: write description"
            :url "http://example.com/FIXME"
            :license {:name "Eclipse Public License"
                      :url "http://www.eclipse.org/legal/epl-v10.html"}
            :dependencies [[org.clojure/clojure "1.4.0"]
                           [midje "1.3.2-SNAPSHOT"]]
            :dev-dependencies [[midje "1.3.2-SNAPSHOT"]
                               [com.stuartsierra/lazytest "1.2.3"]]
            :profiles {:dev {:plugins [[lein-midje "2.0.4"]]}}
            :repositories {"stuart" "http://stuartsierra.com/maven2"})
