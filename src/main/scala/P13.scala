object P13 {

  def encodeDirect[T](list: List[T]): List[(Int, T)] = {

    def go(prev: T, count: Int, rest: List[T]): List[(Int, T)] = {
      rest match {
        case x :: xs if prev == x => go(prev, count + 1, xs)
        case x :: xs              => (count, prev) :: go(x, 1, xs)
        case _                    => List((count, prev))
      }
    }

    list match {
      case x :: xs => go(x, 1, xs)
      case _       => List()
    }
  }
}
