import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P03Spec extends AnyFunSpec with Diagrams {

  describe("P03") {
    it("return first element") {
      assert(P03.findByIndex(0, List(1)) == 1)
    }

    it("return index element") {
      assert(P03.findByIndex(2, List(1, 5, 3, 9)) == 3)
    }

    it("throws error") {
      intercept[Throwable] {
        P03.findByIndex(1, List())
      }
    }
  }
}
