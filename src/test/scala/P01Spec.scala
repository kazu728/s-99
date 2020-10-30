import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P01Spec extends AnyFunSpec with Diagrams {

  describe("P01") {
    it("return last element with one element") {
      assert(P01.last(List(1)) == 1)
    }

    it("return last element with some elements") {
      assert(P01.last(List(1, 5, 3, 9)) == 9)
    }

    it("throws error") {
      intercept[Throwable] {
        P01.last(List())
      }
    }
  }
}
