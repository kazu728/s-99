import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P20Spec extends AnyFunSpec with Diagrams {

  describe("P20") {
    it("return list except index 2") {
      val result: (List[Int], Int) = P20.removeAt(2, List(1, 2, 3, 6))

      assert(result._1 == (List(1, 2, 6)))
      assert(result._2 == 3)
    }
  }
}
