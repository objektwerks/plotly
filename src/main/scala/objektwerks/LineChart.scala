package objektwerks

import plotly.{Config, Plotly, Scatter}
import plotly.layout.Layout

object LineChart: 
  def apply: Unit =
    val line1 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(10, 15, 13, 17)
    )
    
    val line2 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(16, 5, 11, 9)
    )
    
    val data = Seq(line1, line2)
  
    val layout = Layout(
      title = "Line Chart"
    )
  
    val config = Config(
      responsive = true
    )
      
    Plotly.plot(
      div = "plot",
      data = data,
      layout = layout,
      config = config
    )