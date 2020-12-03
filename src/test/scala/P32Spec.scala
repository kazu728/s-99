import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P32Spec extends AnyFunSpec with Diagrams {

  describe("P32") {
    it("return 8") {
      assert(P32.gcd(24, 16) == 8)
    }

    it("return 1") {
      assert(P32.gcd(13, 16) == 1)
    }
    it("occurs system error") {
      intercept[Throwable] {
        P32.gcd(0, 16)
      }
    }
  }
}
