object P05 {

  def reverse[T](list: List[T], acc: List[T]): List[T] = {
    list match {
      case Nil       => acc
      case (x :: xs) => reverse(xs, x :: acc)
    }
  }
}
