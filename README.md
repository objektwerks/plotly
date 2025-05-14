Plotly
------
>Plotly ***charts*** using ScalaJs and Scala 3.

Charts
------
>See ```./charts``` for images of:
1. BarChart
2. LineChart
3. TimeSeriesChart

Plotly Versioning
-----------------
>**plotly.js** ```3.0.1```, the current version, ***does not*** display **plotly-scala** ```Layout.title / .withTitle```.

>**plotly.js** ```1.58.5``` *and* ```2.35.3``` ***do correctly*** display **plotly-scala** ```Layout.title / .withTitle```.

>Other issues may exist in the **plotly.js** ```2.x.x``` branch. None were encountered building the above charts.

>Development of **plotly-scala** appears to have stopped with **plotly.js** ```1.54.1```.

Cross Versioning
----------------
>The sbt ```libraryDependencies``` line ```("org.plotly-scala" %%% "plotly-render" % "0.8.5").cross(CrossVersion.for3Use2_13)``` allows
>**plotly-scala** to be used in a Scala 3 sbt single-module project without ***any*** additional dependencies.

>Attempting to add additional Scala 2 or 3 dependencies results in sbt versioning errors. Purportedly, this article, [Classpath Level](https://docs.scala-lang.org/scala3/guides/migration/compatibility-classpath.html), provides a solution where others fail. See [Laminar-Plotly](https://github.com/objektwerks/laminar.plotly) for one solution.

>**plotly-scala** appears to use custom Scala 2 macros via [data-class](https://github.com/alexarchambault/data-class), which likely
>explains why a Scala 3 port has not been attempted.

Install
-------
1. brew install node
2. npm install npm-check-updates
3. npm install vite
>See **package.json**.

Update
------
1. ncu
2. ncu -u

Build
-----
1. npm install ( only when package.json changes )
2. sbt clean compile fastLinkJS
>See **target/public** directory.

Dev
---
>Edits are reflected in both sessions.
1. sbt ( new session )
2. ~ fastLinkJS
3. npm run dev ( new session )

Package
-------
1. sbt clean compile fullLinkJS
2. npm run build
>See **dist** directory.

Browser
-------
1. sbt clean compile fastLinkJS
2. npm run dev

Reference
---------
1. [plotly-scala](https://github.com/alexarchambault/plotly-scala)
2. [plotly.js](https://www.npmjs.com/package/plotly.js/v/1.47.4?activeTab=versions)
3. [ScalaJs-Vite Tutorial](https://www.scala-js.org/doc/tutorial/scalajs-vite.html)
