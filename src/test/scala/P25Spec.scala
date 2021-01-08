import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class P25Spec extends AnyFunSpec with Diagrams {
  describe("P25") {
    it("return duplicated list") {
      assert(
        P25.randomPermute(List('a', 'b', 'c', 'd', 'e', 'f')).size ==
          List('a', 'b', 'c', 'd', 'e', 'f').size
      )
    }
  }
}
