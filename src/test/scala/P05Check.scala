import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, propBoolean}

class P05Check extends Properties("P05") {
  property("reverse()") = forAll { l: List[Int] =>
    P05.reverse(l, List()) == l.reverse
  }
}
