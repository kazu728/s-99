object P04 {

  def length[T](acc: Int, list: List[T]): Int = {
    list match {
      case Nil       => acc
      case (x :: xs) => length(acc + 1, xs)
    }
  }
}
