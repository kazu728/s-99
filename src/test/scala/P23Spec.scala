import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
class P23Spec extends AnyFunSpec with Diagrams {
  describe("P23") {
    it("return duplicated list") {
      val result = P23.randomSelect(3, List('a', 'b', 'c', 'd', 'f', 'g', 'h'))
      assert(result.size == 3)
    }
  }
}
