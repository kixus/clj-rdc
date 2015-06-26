(defproject kixus/reduce           "0.1.0"
    :description                    "Generalized multi-dimensional reduce functions in Clojure."
    :url                            "https://github.com/kixus/reduce-clj"
    :license        {   :name       "BSD 3-Clause License"
                        :url        "http://opensource.org/licenses/BSD-3-Clause"
                    }
    :dependencies   [   [org.clojure/clojure "1.6.0"]
                    ]
    :profiles       {   :dev        [   ;; :dependencies   [
                                        ;;                 ]
                                        ;; :plugins        [
                                        ;;                 ]
                                    ]

                    }
    :repositories   {   "sonatype"  "https://oss.sonatype.org/content/repositories/releases/"
                    }
    :target-path    "out/tgt"
    :source-paths   ["src" "tst"]
    :resource-paths ["res"]
)
