enablePlugins(ScalaJSPlugin)

scalaVersion := "3.7.1-RC1"
libraryDependencies ++= {
  Seq(
    ("org.plotly-scala" %%% "plotly-render" % "0.8.5").cross(CrossVersion.for3Use2_13),
    "org.scala-js" %%% "scalajs-dom" % "2.8.0"
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
scalaJSUseMainModuleInitializer := true