name := "prismicio-starter"

version := "1.2"

scalaVersion := "2.11.1"

libraryDependencies += "io.prismic" %% "scala-kit" % "1.2.10"

lazy val root = (project in file(".")).enablePlugins(PlayScala)
