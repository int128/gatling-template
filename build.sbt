enablePlugins(JavaAppPackaging)
enablePlugins(GatlingPlugin)

scalaVersion := "2.13.10"
name := "gatling"
organization := "io.github.int128"
version := "latest"

val gatlingVersion = "3.9.2"
libraryDependencies += "io.gatling.highcharts" % "gatling-charts-highcharts" % gatlingVersion
libraryDependencies += "io.gatling" % "gatling-test-framework" % gatlingVersion

mainClass in Compile := Some("io.gatling.app.Gatling")

// include the simulations to the tar ball
scalaSource in Compile := baseDirectory.value / "src/test/scala"
resourceDirectory in Compile := baseDirectory.value / "src/test/resources"
