import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P39Spec extends AnyFunSpec with Diagrams {

  describe("P39") {
    it("return isPrime list") {
      assert(
        P39.listPrimesInRange(7 to 31) == List(7, 11, 13, 17, 19, 23, 29, 31)
      )
    }

    it("return empty list") {
      assert(
        P39.listPrimesInRange(1 to 1) == List()
      )
    }
  }
}
