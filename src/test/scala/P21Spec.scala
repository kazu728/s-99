import org.scalatest.funspec.AnyFunSpec
import org.scalatest.diagrams.Diagrams

class P21Spec extends AnyFunSpec with Diagrams {

  describe("P21") {
    it("return list added 6") {
      assert(P21.insertAt(6, 0, List(8, 4, 1, 5)) == List(6, 8, 4, 1, 5))
      assert(P21.insertAt(6, 2, List(8, 4, 1, 5)) == List(8, 4, 6, 1, 5))
      // val result: (List[Int], Int) = P20.removeAt(2, List(1, 2, 3, 6))
//
      // assert(result._1 == (List(1, 2, 6)))
      // assert(result._2 == 3)
    }
  }
}
