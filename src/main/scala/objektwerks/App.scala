package objektwerks

import plotly.Scatter
import plotly.Plotly

@main def runPlotly: Unit =
  val line1 = Scatter(
    Seq(1, 2, 3, 4),
    Seq(10, 15, 13, 17)
  )
  
  val line2 = Scatter(
    Seq(1, 2, 3, 4),
    Seq(16, 5, 11, 9)
  )
  
  val data = Seq(line1, line2)
  
  Plotly.plot("plot", data)