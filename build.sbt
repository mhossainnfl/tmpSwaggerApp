inThisBuild(Seq(
  scalaVersion := "2.12.15"
  )
)

val jacksonVersion         = "2.11.4"
val jacksonDatabindVersion = jacksonVersion

val jacksonDatabind = Seq("com.fasterxml.jackson.core" % "jackson-databind" % jacksonDatabindVersion)
val jacksons = Seq(
  "com.fasterxml.jackson.core"     % "jackson-core",
  "com.fasterxml.jackson.core"     % "jackson-annotations",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jdk8",
  "com.fasterxml.jackson.datatype" % "jackson-datatype-jsr310"
).map(_ % jacksonVersion) ++ jacksonDatabind

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(
    libraryDependencies ++= Seq(
//      "com.fasterxml.jackson.module" %% "jackson-module-scala" % "2.12.3",
//      "com.fasterxml.jackson" % "jackson-bom" % "2.12.3",
      "io.swagger.core.v3" % "swagger-annotations" % "2.2.4",
      "io.swagger.core.v3" % "swagger-core" % "2.2.4",
      "io.swagger.core.v3" % "swagger-models" % "2.2.4"
    ) ++ jacksons
      ++ jacksonDatabind
  )



