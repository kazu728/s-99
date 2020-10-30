import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P05Spec extends AnyFunSpec with Diagrams {

  describe("P05") {
    it("return reversed list with some elements") {
      assert(P05.reverse(List(2, 5, 1), List()) == List(2, 5, 1).reverse)
    }

    it("return reversed list with empty list") {
      assert(P05.reverse(List(), List()) == List())
    }
  }
}
