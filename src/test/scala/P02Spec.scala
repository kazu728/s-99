import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P02Spec extends AnyFunSpec with Diagrams {

  describe("P02") {

    it("return second to last element with some elements") {
      assert(P02.sencondToLast(List(1, 5, 3, 9)) == 3)
    }

    it("throws error with one element") {
      intercept[Throwable] {
        P02.sencondToLast(List(1))
      }
    }

    it("throws error with empty list") {
      intercept[Throwable] {
        P02.sencondToLast(List())
      }
    }
  }
}
