scalaVersion := "3.3.1"

val zioVersion = "2.0.17"

libraryDependencies ++= Seq(
  "dev.zio" %% "zio"          % zioVersion,
  "dev.zio" %% "zio-test"     % zioVersion % Test,
  "dev.zio" %% "zio-test-sbt" % zioVersion % Test,

  "org.scalatest" %% "scalatest" % "3.2.17" % Test,

  "com.github.sbt" % "junit-interface" % "0.13.3" % Test,
  "org.assertj" % "assertj-core" % "3.24.2" % Test,
)
