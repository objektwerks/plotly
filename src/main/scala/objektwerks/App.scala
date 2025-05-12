package objektwerks

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.HTMLDocument

import plotly.*, layout.*, Plotly.*

@main def runPlotly: Unit =
  document.addEventListener("DOMContentLoaded", { (_: dom.Event) =>
    build(document)
  })

def build(document: HTMLDocument): Unit =
  val paragraph = document.createElement("p")
  paragraph.id = "pid"
  paragraph.textContent = "Plotly Web App!"
  document.body.appendChild(paragraph)

  val div = document.createElement("div")
  div.id = "plot"
  document.body.appendChild(div)

  val x = (0 to 100).map(_ * 0.1)
  val y1 = x.map(d => 2.0 * d + util.Random.nextGaussian())
  val y2 = x.map(math.exp)
  
  val plot = Seq(
    Scatter(x, y1).withName("Approx twice"),
    Scatter(x, y2).withName("Exp")
  )
  val layout = Layout().withTitle("Curves")
  plot.plot(div = "plot", layout = layout)

  ()