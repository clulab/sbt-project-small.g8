import org.clulab.sbt.BuildUtils
import org.clulab.sbt.Resolvers

name := "$name$"
description := "The $name$ project implements the $package$ package including the $class$ class."

// Last checked 2021-08-23
val scala11 = "2.11.12" // up to 2.11.12
val scala12 = "2.12.14" // up to 2.12.14
val scala13 = "2.13.6"  // up to 2.13.6

// scala13 is skipped here.
ThisBuild / crossScalaVersions := Seq(scala12, scala11)
ThisBuild / scalaVersion := crossScalaVersions.value.head

resolvers ++= Seq(
//  Resolvers.localResolver,  // Reserve for Two Six.
//  Resolvers.clulabResolver, // glove
//  Resolvers.jitpackResolver // Ontologies
)

libraryDependencies ++= {
  Seq(
    // local logging
    // These two can be coordinated so that the same org.slf4j:slf4j-api is used, here 1.7.25.
    "ch.qos.logback"              % "logback-classic" % "1.2.3",       // as of 2021 Aug 11 up to up to 1.2.5
    "com.typesafe.scala-logging" %% "scala-logging"   % "3.7.2",       // as of 2021 Mar 12 up to 3.9.2
    // dependency logging
    "org.apache.logging.log4j"    % "log4j-core"      % "2.12.0",      // as of 2021 Mar 12 up to 2.14.0
    // config
    "com.typesafe"                % "config"          % "1.4.0",       // as of 2021 Mar 12 up to 1.4.1
    "org.scalatest"              %% "scalatest"       % "3.2.5" % Test // as of 2021 Mar 12 up to 3.2.5
  )
}

lazy val core = (project in file("."))
  .enablePlugins(BuildInfoPlugin)
  .disablePlugins(PlayScala, JavaAppPackaging, SbtNativePackager)
  .dependsOn(common % "compile -> compile; test -> test")
  .aggregate(common)
  .settings(
    assembly / aggregate := false,
    assembly / mainClass := Some("$package$.apps.HelloWorldApp")
  )

lazy val common = project
