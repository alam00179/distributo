(defproject setup "0.1.0-SNAPSHOT"
  :description "Distributo"
  :dependencies [[org.clojure/clojure "1.7.0"]

                 ;; Tools
                 [org.clojure/tools.cli "0.3.3"]
                 [base64-clj "0.1.1"]
                 [org.clojure/core.async "0.2.374"]
                 [jarohen/chime "0.1.9"]

                 ;; Amazon Web Services
                 [com.amazonaws/aws-java-sdk-ec2 "1.10.46"]
                 [com.amazonaws/aws-java-sdk-ecs "1.10.46"]

                 ;;Logging
                 [org.clojure/tools.logging "0.2.6"]
                 [org.slf4j/slf4j-log4j12 "1.7.12"]]

  :main distributo.core
  :jvm-opts ["-Xmx2g", "-server"])
