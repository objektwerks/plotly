package objektwerks

import plotly.{Config, Plotly, Scatter}
import plotly.layout.Layout
import plotly.layout.Axis

object LineChart: 
  def apply(id: String): Unit =
    val line1 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(3, 5, 7, 9)
    ).withName("line 1")

    val line2 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(2, 4, 6, 8)
    ).withName("line 2")
    
    val data = Seq(line1, line2)
  
    val layout = Layout(
    ).withTitle("Line Chart")
     .withXaxis(Axis(title = "line 1"))
     .withYaxis(Axis(title = "line 2"))
  
    val config = Config(
      responsive = true
    )
      
    Plotly.plot(
      div = id,
      data = data,
      layout = layout,
      config = config
    )