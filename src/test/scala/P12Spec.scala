import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P12Spec extends AnyFunSpec with Diagrams {

  describe("P12") {
    it("return decoded value") {
      assert(
        P12.decode(
          List((4, 'a'), (1, 'b'), (2, 'c'), (2, 'a'), (1, 'd'), (4, 'e'))
        ) ==
          List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
            'e')
      )
    }
  }
}
