name := """demo"""
organization := "com.indipaisa.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file("."))

  .settings(

    scalaVersion := "2.13.1",
    name := """demo"""
      organization := "com.indipaisa.com"
version := "1.0-SNAPSHOT"
lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.13.8"
libraryDependencies ++= Seq(
  guice,
  jdbc,
  caffeine,
  javaWs,
  cacheApi,
  "mysql" % "mysql-connector-java" % "8.0.22",
  // To provide an implementation of JAXB-API, which is required by Ebean.
  "org.projectlombok" % "lombok" % "1.18.16" % "provided",
  "org.postgresql" % "postgresql" % "42.3.3",
)