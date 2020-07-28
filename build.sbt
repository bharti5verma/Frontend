name := """Frontend"""
organization := "com.example"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
resolvers ++= Seq(
  Resolver.bintrayRepo("hmrc", "releases"),
  Resolver.jcenterRepo)

scalaVersion := "2.12.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.3" % Test
libraryDependencies += "uk.gov.hmrc" %% "govuk-template" % "5.55.0-play-27"
libraryDependencies += "uk.gov.hmrc" %% "bootstrap-frontend-play-27" % "2.24.0"
libraryDependencies += "uk.gov.hmrc" %% "play-ui" % "8.11.0-play-27"

// Adds additional packages into Twirl
//TwirlKeys.templateImports += "com.example.controllers._"

// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "com.example.binders._"
