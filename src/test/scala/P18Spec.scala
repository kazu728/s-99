import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class P18Spec extends AnyFunSpec with Diagrams {
  describe("P18") {
    it("return duplicated list") {
      assert(
        P18.slice(
          3,
          7,
          List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
        ) == List('d', 'e', 'f', 'g')
      )
    }
  }
}
