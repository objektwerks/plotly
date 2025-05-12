package objektwerks

import plotly.{Config, Plotly, Scatter}
import plotly.layout.Layout
import plotly.layout.Axis

object LineChart: 
  def apply(id: String): Unit =
    val line1 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(3, 5, 7, 9)
    )

    val line2 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(2, 4, 6, 8)
    )
    
    val data = Seq(line1, line2)
  
    val layout = Layout(
      title = "Line Chart",
      xaxis = Axis(title = "line 1"),
      yaxis = Axis(title = "line 2")
    )
  
    val config = Config(
      responsive = true
    )
      
    Plotly.plot(
      div = id,
      data = data,
      layout = layout,
      config = config
    )