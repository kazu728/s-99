import org.scalacheck.{Properties, Gen, Arbitrary}
import org.scalacheck.Prop.{forAll, propBoolean}

class P03Check extends Properties("P03") {
  property("findByIndex()") = {
    val gen = for {
      x <- Gen.choose(1, 10)
      y <- Gen.choose(0, x - 1)
      s <- Gen.listOfN(x, implicitly[Arbitrary[Int]].arbitrary)
    } yield (s, y)

    forAll(gen) {
      case (s, i) => P03.findByIndex(i, s) == s(i)
    }
  }
}
