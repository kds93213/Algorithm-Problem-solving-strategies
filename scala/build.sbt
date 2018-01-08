lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "com.yoohaemin",
      scalaVersion := "2.11.1",
      version      := "0.1.0-SNAPSHOT"
    )),
    name := "Algospot",
    libraryDependencies ++=
      "com.lihaoyi"   %% "utest"     % "0.6.0" % "test"  :: Nil,
    testFrameworks += new TestFramework("utest.runner.Framework")
  )
