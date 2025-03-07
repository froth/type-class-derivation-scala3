val scala3Version = "3.3.5"

lazy val root = project
  .in(file("."))
  .settings(
    name := "type-class-derivation-scala3",
    organization := "com.xebia.functional",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scala3Version,
    libraryDependencies ++= Seq(
      "org.typelevel" %% "shapeless3-deriving" % "3.4.3",
      "org.scalameta" %% "munit" % "0.7.29" % Test
    )
  )
