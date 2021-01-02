object P16 {
  def drop[T](
      n: Int,
      list: List[T],
      count: Int = 1,
      acc: List[T] = List()
  ): List[T] = {
    list match {
      case x :: xs if count == n => drop(n, xs, count + 1, acc)
      case x :: xs if count != n => x :: drop(n, xs, count + 1, acc)
      case _                     => acc
    }
  }
}
