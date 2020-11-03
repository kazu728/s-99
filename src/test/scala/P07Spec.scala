import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P07Spec extends AnyFunSpec with Diagrams {

  describe("P07") {
    it("return flatten list") {
      assert(
        P07.flatten(List(1, List(2, 4), List(1, List(9, 3)))) == List(
          1, 2, 4, 1, 9, 3
        )
      )
    }
  }
}
