package objektwerks

import plotly.{Config, Plotly, Scatter}
import plotly.layout.Layout

object LineChart: 
  def apply(id: String): Unit =
    val series1 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(9, 7, 5, 3)
    ).withName("series 1")

    val series2 = Scatter(
      x = Seq(1, 2, 3, 4),
      y = Seq(10, 8, 6, 4)
    ).withName("series 2")
    
    val data = Seq(series1, series2)
  
    val layout = Layout().withTitle("Line Chart")
  
    val config = Config(responsive = true)
      
    Plotly.plot(
      div = id,
      data = data,
      layout = layout,
      config = config
    )