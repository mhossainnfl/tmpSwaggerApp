lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    libraryDependencies ++= Seq(
      "io.swagger.core.v3" % "swagger-annotations" % "2.0.0",
//      "io.swagger.core.v3" % "swagger-core" % "2.0.0",
//      "io.swagger.core.v3" % "swagger-models" % "2.0.0",
//      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.12.1"
    )
  )


