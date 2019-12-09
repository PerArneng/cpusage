/*
scalaVersion := "2.13.1"

name := "cpusage"
organization := "com.scalebit"
version := "1.0"
*/

//libraryDependencies += "org.typelevel" %% "cats-core" % "2.0.0"

lazy val root = (project in file(".")).
    settings(
        inThisBuild(List(
            organization := "com.scalebit",
            scalaVersion := "2.13.1"
        )),
        name := "cpusage",
        version := "0.1"
    )

lazy val libcpusage = (project in file("libcpusage")).
    settings(
        inThisBuild(List(
            organization := "com.scalebit",
            scalaVersion := "2.13.1"
        )),
        name := "libcpusage",
        version := "0.1"
    )


// To learn more about multi-project builds, head over to the official sbt
// documentation at http://www.scala-sbt.org/documentation.html
