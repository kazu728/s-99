import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams
import util.Node
import util.End
class P56Spec extends AnyFunSpec with Diagrams {
  describe("P56") {
    it("return is symmetric") {
      assert(P56.isSymmetric(Node('a', Node('b'), Node('c'))) == true)
    }
    it("return is not symmetric") {
      assert(P56.isSymmetric(Node('a', End, Node('c'))) == false)
    }
  }
}
