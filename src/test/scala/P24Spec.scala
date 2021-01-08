import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class P24Spec extends AnyFunSpec with Diagrams {
  describe("P24") {
    it("return duplicated list") {
      assert(P24.lotto(6, 49).size == 6)
    }
  }
}
