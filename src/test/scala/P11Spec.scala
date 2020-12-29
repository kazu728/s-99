import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P11Spec extends AnyFunSpec with Diagrams {

  describe("P11") {
    it("return packed list") {
      assert(
        P11.encodeModified(
          List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
            'e')
        ) == List((4, 'a'), 'b', (2, 'c'), (2, 'a'), 'd', (4, 'e'))
      )
    }
  }
}
