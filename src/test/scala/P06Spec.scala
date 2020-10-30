import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P06Spec extends AnyFunSpec with Diagrams {

  describe("P06") {
    it("return true") {
      assert(P06.isParindrome(List(3, 1, 2, 1, 3)) == true)
    }

    it("return false") {
      assert(P06.isParindrome(List(1, 2, 1, 3)) == false)
    }
  }
}
