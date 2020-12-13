import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P22Spec extends AnyFunSpec with Diagrams {

  describe("P22") {
    it("return list with later is greater than former") {
      assert(P22.createList(1, 5) == List(1, 2, 3, 4, 5))
    }

    it("return list with former is greater than laster") {
      assert(P22.createList(6, 3) == List(3, 4, 5, 6))
    }
  }
}
