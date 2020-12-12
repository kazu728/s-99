object P21 {

  def insertAt[T](a: T, nth: Int, list: List[T]): List[T] = {
    list match {
      case x if nth == 0      => a :: x
      case x :: xs if nth > 0 => x :: insertAt(a, nth - 1, xs)
      case _                  => sys.error("")
    }
  }
}
