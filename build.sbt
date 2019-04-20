import Dependencies._

ThisBuild / scalaVersion := "2.12.8"
ThisBuild / version := "0.1-SNAPSHOT"
ThisBuild / organization := "eu.frlab"
ThisBuild / organizationName := "FRLab"

lazy val root = (project in file("."))
  .aggregate(helper, main)
//  .enablePlugins(JavaAppPackaging)
  .settings(
    name := "sbt-playground",
//    maintainer := "yannis@ianos"
  )

lazy val helper = (project in file("helper"))
  .settings(
    name := "sbt-playground-helper",
  )

lazy val main = (project in file("main"))
  .dependsOn(helper)
  .settings(
    name := "sbt-playground-main",
    libraryDependencies += scalaTest % Test
  )

ThisBuild / description := "SBT and Scala playground project"
ThisBuild / licenses := List("Apache 2" -> new URL("http://www.apache.org/licenses/LICENSE-2.0.txt"))
ThisBuild / homepage := Some(url("https://github.com/example/project"))
ThisBuild / scmInfo := Some(
  ScmInfo(
    url("https://github.com/yannisf/sbt-playground"),
    "scm:https://github.com/yannisf/sbt-playground.git"
  )
)
ThisBuild / developers := List(
  Developer(
    id = "yannisf",
    name = "YannisF",
    email = "yannis@ouranos",
    url = url("https://frlab.eu")
  )
)
