package objektwerks

import org.scalajs.dom
import org.scalajs.dom.document
import org.scalajs.dom.HTMLDocument

@main def runPlotly: Unit =
  document.addEventListener("DOMContentLoaded", { (_: dom.Event) =>
    build(document)
  })

def build(document: HTMLDocument): Unit =
  val paragraph = document.createElement("p")
  paragraph.id = "pid"
  paragraph.textContent = "Plotly Web App!"
  document.body.appendChild(paragraph)
  ()