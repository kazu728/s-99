import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P31Spec extends AnyFunSpec with Diagrams {

  describe("P31") {
    it("return false with non-prime") {
      assert(
        P31.isPrime(4) == false
      )
    }

    it("return true with prime ") {
      assert(
        P31.isPrime(7) == true
      )
    }

    it("return true with 1 ") {
      assert(
        P31.isPrime(1) == false
      )
    }
  }
}
