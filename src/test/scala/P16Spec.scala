import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P16Spec extends AnyFunSpec with Diagrams {

  describe("P16") {
    it("return droped list") {
      assert(
        P16.drop(
          3,
          List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
        ) == List('a', 'b', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
      )
    }
  }
}
