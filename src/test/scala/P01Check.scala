import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, propBoolean}

class P01Check extends Properties("P01") {
  property("last()") = forAll { l: List[Int] =>
    !l.isEmpty ==> (P01.last(l) == l.last)
  }
}
