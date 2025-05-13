package objektwerks

import plotly.{Plotly, Scatter}

object TimeSeriesChart:
  def apply(id: String): Unit =
    val data = Seq(
      Scatter(
        Seq("2025-05-10", "2025-05-11", "2025-05-12"),
        Seq(1, 3, 6)
      )
    )

    Plotly.plot(id, data)