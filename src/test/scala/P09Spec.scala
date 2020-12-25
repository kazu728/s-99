import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P09Spec extends AnyFunSpec with Diagrams {

  describe("P09") {
    it("return packed list") {
      assert(
        P09.pack(
          List('a', 'a', 'a', 'a', 'b', 'c', 'c', 'a', 'a', 'd', 'e', 'e', 'e',
            'e')
        ) == List(
          List('a', 'a', 'a', 'a'),
          List('b'),
          List('c', 'c'),
          List('a', 'a'),
          List('d'),
          List('e', 'e', 'e', 'e')
        )
      )
    }
  }
}
