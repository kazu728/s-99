import org.scalacheck.Prop.{forAll, propBoolean}
import org.scalacheck.{Gen, Properties}
import Gen.{listOf, chooseNum}

class P06Check extends Properties("P06") {

  val parindromes: Gen[List[Int]] =
    listOf(chooseNum(Int.MinValue, Int.MaxValue)).map { x => x ++ x.reverse }

  property("isParindrome()") = forAll(parindromes) { l: List[Int] =>
    P06.isParindrome(l)
  }
}
