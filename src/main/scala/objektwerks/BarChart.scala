package objektwerks

import plotly.{Bar, Config, Plotly}
import plotly.layout.Layout

object BarChart:
  def apply(id: String): Unit =                
    val data = Seq(
      Bar(
        Seq("giraffes", "orangutans", "monkeys"),
        Seq(20, 14, 23)
      )
    )

    val layout = Layout().withTitle("Bar Chart")
  
    val config = Config(responsive = true)

    Plotly.plot(
      div = id,
      data = data,
      layout = layout,
      config = config
    )