
val specs2Version = "4.0.2" // use the version used by discipline
val specs2Core  = "org.specs2" %% "specs2-core" % specs2Version
val specs2Scalacheck = "org.specs2" %% "specs2-scalacheck" % specs2Version
val scalacheck = "org.scalacheck" %% "scalacheck" % "1.12.4"

lazy val root = (project in file(".")).
  settings(
    organization := "q2io",
    name := "ListPermutation",
    scalaVersion := "2.12.4",
    libraryDependencies ++= Seq(
      specs2Core % Test, specs2Scalacheck % Test, scalacheck % Test
    ),
    scalacOptions ++= Seq(
      "-deprecation",
      "-encoding", "UTF-8",
      "-Ypartial-unification",
      "-feature",
      "-language:_"
    )
  )

resolvers += Resolver.sbtPluginRepo("releases")
