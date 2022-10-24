inThisBuild(Seq(
  scalaVersion := "2.12.15"
  )
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    libraryDependencies ++= Seq(
      "com.fasterxml.jackson.core" % "jackson-core" % "2.13.4",
      "com.fasterxml.jackson.core" % "jackson-annotations" % "2.13.4",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8" % "2.13.4",
      "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310" % "2.13.4",
      "com.fasterxml.jackson.core" % "jackson-databind" % "2.13.4",
      "com.fasterxml.jackson.dataformat" % "jackson-dataformat-cbor" % "2.13.4",
      "com.fasterxml.jackson.module" % "jackson-module-parameter-names" % "2.13.4",
      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.13.4",
      "io.swagger.core.v3" % "swagger-annotations" % "2.2.4",
      "io.swagger.core.v3" % "swagger-core" % "2.2.4",
      "io.swagger.core.v3" % "swagger-models" % "2.2.4"
    )
  )



