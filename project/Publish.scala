import sbt._, Keys._
import bintray.BintrayKeys._


object Publish {

  val bintraySettings = Seq(
    bintrayOrganization := Some("iheartradio"),
    bintrayPackageLabels := Seq("Future", "Either", "Functional", "Xor", "Scala")
  )

  val publishingSettings = Seq(
    organization in ThisBuild := "com.iheart",
    publishMavenStyle := true,
    licenses := Seq("Apache-2.0" -> url("https://www.apache.org/licenses/LICENSE-2.0.html")),
    homepage := Some(url("http://iheartradio.github.io/happy-path")),
    scmInfo := Some(ScmInfo(url("https://github.com/iheartradio/happy-path"),
      "git@github.com:iheartradio/happy-path.git")),
    pomIncludeRepository := { _ => false },
    publishArtifact in Test := false
  )

  val settings = bintraySettings ++ publishingSettings
}

