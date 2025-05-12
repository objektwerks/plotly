package objektwerks

import plotly.Scatter
import plotly.layout.Layout
import plotly.Plotly.TraceSeqOps

@main def runPlotly: Unit =
  val x = (0 to 100).map(_ * 0.1)
  val y1 = x.map(d => 2.0 * d + util.Random.nextGaussian())
  val y2 = x.map(math.exp)
  
  val plot = Seq(
    Scatter(x, y1).withName("Approx twice"),
    Scatter(x, y2).withName("Exp")
  )
  val layout = Layout().withTitle("Curves")
  plot.plot(div = "plot", layout = layout)