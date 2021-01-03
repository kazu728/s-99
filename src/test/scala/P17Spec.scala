import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P17Spec extends AnyFunSpec with Diagrams {
  describe("P17") {
    it("return duplicated list") {
      assert(
        P17.split(
          3,
          List('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k')
        ) == (List('a', 'b', 'c'), List('d', 'e', 'f', 'g', 'h', 'i', 'j', 'k'))
      )
    }
  }
}
