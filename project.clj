(defproject dsaclj "0.1.0-SNAPSHOT"
  :description "Data structures and Algorithms in Clojure"
  :url "http://github.com/bronen/dsa-clj"
  :license {:name "MIT"
            :url "https://choosealicense.com/licenses/mit"
            :key "mit"
            :year 2024
            :comment "MIT License"}
  :dependencies [[org.clojure/clojure "1.11.1"]]
  :main ^:skip-aot dsaclj.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all
                       :jvm-opts ["-Dclojure.compiler.direct-linking=true"]}})
