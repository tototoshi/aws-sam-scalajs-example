import org.scalajs.linker.interface.ModuleInitializer
val scalaVersion_3 = "3.3.3"

lazy val root = project
  .in(file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "aws-sam-scalajs-example",
    organization := "com.github.tototoshi",
    version := "0.1.0-SNAPSHOT",
    scalaVersion := scalaVersion_3,
    libraryDependencies ++= Seq(
      "org.scalatest" %%% "scalatest" % "3.2.18" % "test"
    ),
    scalaJSLinkerConfig ~= {
      _.withModuleKind(ModuleKind.CommonJSModule)
    },
  )
