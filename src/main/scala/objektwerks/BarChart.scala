package objektwerks

import plotly.{Bar, Plotly}

object BarChart:
  def apply(id: String): Unit =                
    val data = Seq(
      Bar(
        Seq("giraffes", "orangutans", "monkeys"),
        Seq(20, 14, 23)
      )
    )

    Plotly.plot(id, data)