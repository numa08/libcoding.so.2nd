import sbt._
import sbt.Keys._

object Libcoding_so_2Build extends Build {

  lazy val libcoding_so_2 = Project(
    id = "libcoding_so_2",
    base = file("."),
    settings = Project.defaultSettings ++ Seq(
      name := "Libcoding_so_2",
      organization := "net.numa08.libcoding_so2",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.10.2"
      // add other settings here
    )
  )
}
