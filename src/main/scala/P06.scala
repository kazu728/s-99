object P06 {

  def reverse[T](list: List[T], acc: List[T] = List()): List[T] = {
    list match {
      case Nil       => acc
      case (x :: xs) => reverse(xs, x :: acc)
    }
  }

  def isParindrome[T](list: List[T]): Boolean = {
    list == reverse(list)
  }
}
