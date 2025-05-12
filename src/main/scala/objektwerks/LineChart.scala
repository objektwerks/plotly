package objektwerks

import plotly.{Config, Plotly, Scatter}
import plotly.layout.Layout

object LineChart: 
  def apply(): Unit =
    val line = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(3, 5, 7, 9)
    )
    
    val data = Seq(line)
  
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