import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, propBoolean}

class P07Check extends Properties("P07") {
  property("flattern()") = forAll { l: List[List[Int]] =>
    P07.flatten(l) == l.flatten
  }
}
