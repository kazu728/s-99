import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import util._
import P61.RichTree

class P61Spec extends AnyFunSpec with Diagrams {
  describe("P61") {
    it("it count leaf number") {
      assert(
        Node('x', Node('x'), End).leafCount == 1
      )
    }
  }
}
