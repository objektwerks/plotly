enablePlugins(ScalaJSPlugin)

name := "plotly"
version := "3.0.0"
scalaVersion := "3.7.3-RC2"
libraryDependencies ++= {
  Seq(
    ("org.plotly-scala" %%% "plotly-render" % "0.8.5").cross(CrossVersion.for3Use2_13)
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
scalaJSUseMainModuleInitializer := true
