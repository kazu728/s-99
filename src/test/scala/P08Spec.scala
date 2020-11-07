import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P08Spec extends AnyFunSpec with Diagrams {

  describe("P08") {
    it("return compressed list") {
      assert(
        P08.compress(
          List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
            'e')
        ) == List('a', 'b', 'c', 'a', 'd', 'e')
      )
    }
  }
}
