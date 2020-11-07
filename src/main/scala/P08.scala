object P08 {

  def reverse[T](list: List[T], acc: List[T]): List[T] = {
    list match {
      case x :: xs => reverse(xs, x :: acc)
      case Nil     => acc
    }
  }

  def compress[T](list: List[T], acc: List[T] = List()): List[T] = {

    list match {
      case x :: xs if acc.isEmpty   => compress(xs, x :: acc)
      case x :: xs if x != acc.head => compress(xs, x :: acc)
      case x :: xs if x == acc.head => compress(xs, acc)
      case Nil                      => reverse(acc, List())
    }
  }
}
