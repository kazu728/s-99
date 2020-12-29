import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P10Spec extends AnyFunSpec with Diagrams {

  describe("P10") {
    it("return packed list") {
      assert(
        P10.encode(
          List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
            'e')
        ) == List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
      )
    }
  }
}
