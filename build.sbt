enablePlugins(ScalaJSPlugin)

scalaVersion := "3.7.0"
libraryDependencies ++= {
  Seq(
    "org.scala-js" %%% "scalajs-dom" % "2.8.0",
    "com.outr" %%% "scribe" % "3.16.1",
    "com.lihaoyi" %%% "utest" % "0.8.5" % Test
  )
}
scalacOptions ++= Seq(
  "-Wunused:all"
)
jsEnv := new org.scalajs.jsenv.jsdomnodejs.JSDOMNodeJSEnv()
testFrameworks += new TestFramework("utest.runner.Framework")
scalaJSUseMainModuleInitializer := true