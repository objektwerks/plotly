package objektwerks

import org.scalajs.dom.document

import utest.*

object AppTest extends TestSuite {
  App.build(document)

  val tests = Tests {
    test("paragraph") {
      assert(
        document
          .querySelectorAll("p")
          .count(_.id == "pid") == 1
      )
    }
  }

  TestRunner.run(tests)
}