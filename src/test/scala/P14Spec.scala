import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P14Spec extends AnyFunSpec with Diagrams {

  describe("P14") {
    it("return duplicated list") {
      assert(
        P14.duplicate(List('a', 'b', 'c', 'c', 'd')) == List('a', 'a', 'b', 'b',
          'c', 'c', 'c', 'c', 'd', 'd')
      )
    }
  }
}
