import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class P15Spec extends AnyFunSpec with Diagrams {
  describe("P15") {
    it("return duplicated list") {
      assert(
        P15.duplicate(3, List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'a',
          'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd')
      )
    }
  }
}
