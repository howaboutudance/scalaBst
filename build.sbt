name := "scalaBST"

organization := "tech.hematite"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.1"

libraryDependencies += "org.scalatest" %% "scalatest" % "3.1.0" % "test"
libraryDependencies += "org.scalaz" %% "scalaz-core" % "7.3.1"

scalafmtOnCompile := true

initialCommands := "import tech.hematite.scalabst._"
