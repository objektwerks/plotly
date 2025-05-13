package objektwerks

import plotly.{Config, Plotly, Scatter}
import plotly.layout.Layout

object TimeSeriesChart:
  def apply(id: String): Unit =
    val series = Scatter(
      Seq("2025-05-10 09:31:00", "2025-05-11 10:41:00", "2025-05-12 11:51:00"),
      Seq(1, 3, 6)
    )

    val data = Seq(series)

    val layout = Layout().withTitle("Time Series Chart")
  
    val config = Config(responsive = true)

    Plotly.plot(
      div = id,
      data = data,
      layout = layout,
      config = config
    )