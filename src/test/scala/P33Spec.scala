import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P33Spec extends AnyFunSpec with Diagrams {

  describe("P33") {
    it("is not divided") {
      assert(P33.isCoprime(35, 64, 2, true) == true)
    }

    it("is divided 2 ") {
      assert(P33.isCoprime(34, 64, 2, false) == false)
    }
    it("is divided 5") {
      assert(P33.isCoprime(35, 15, 2, false) == false)
    }
  }
}
