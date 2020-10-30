import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P04Spec extends AnyFunSpec with Diagrams {

  describe("P04") {
    it("return length with some elements") {
      assert(P04.length(0, List(1, 2, 3)) == 3)
    }

    it("return 0") {
      assert(P04.length(0, List()) == 0)
    }
  }
}
