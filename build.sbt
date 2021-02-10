enablePlugins(JavaAppPackaging)
enablePlugins(GatlingPlugin)

scalaVersion := "2.13.4"
organization := "io.github.int128"
version := "0.1.0"

val gatlingVersion = "3.5.1"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion
libraryDependencies += "io.gatling" % "gatling-test-framework" % gatlingVersion

mainClass in Compile := Some("io.gatling.app.Gatling")
