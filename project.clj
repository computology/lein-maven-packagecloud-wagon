(defproject lein-maven-packagecloud-wagon "0.0.1"
  :description "Maven Packagecloud Wagon wrapper for Leiningen"
  :url "https://github.com/computology/lein-maven-packagecloud-wagon.git"
  :license {:name "MIT" :url "http://opensource.org/licenses/MIT"}

  :dependencies [[io.packagecloud.maven.wagon/maven-packagecloud-wagon "0.0.4"]]

  :deploy-repositories [["releases" {:url "https://clojars.org/repo/"
                                     :creds :gpg}]]

  :eval-in :leiningen)
