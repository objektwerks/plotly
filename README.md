Plotly
------
>Plotly ***poc*** using ScalaJs and Scala 3.

Issues
------
>The current version of **plotly.js**, ```3.0.1```, does not display **plotly-scala** ```Layout.title``` or ```Layout.withTitle```.

>**plotly.js** versions ```1.58.5``` and ```2.35.3``` do correctly display **plotly-scala** ```Layout.title``` and ```Layout.withTitle```.

>Other issues may exist in the **plotly.js** ```2.x.x``` branch. Development of **plotly-scala** stopped at ```1.54.1```.

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