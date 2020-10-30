import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, propBoolean}

class P04Check extends Properties("P04") {
  property("length()") = forAll { l: List[Int] => P04.length(0, l) == l.length }
}
