(defproject demo-lein "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url  "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.11.0"]
                 [org.springframework.boot/spring-boot-starter-webflux "3.2.3"]]

  :repositories []

  :source-paths ["src/clojure" "test/clojure"]
  :java-source-paths ["src/java" "test/java"]


  :aot :all
  :main demoj_lein.DemoApplication)