import org.scalacheck.Properties
import org.scalacheck.Prop.{forAll, propBoolean}

class P02Check extends Properties("P02") {
  property("secondToLast") = forAll { l: List[Int] =>
    l.length > 1 ==> (P02.sencondToLast(l) == l.dropRight(1).last)
  }
}
