object P15 {

  def duplicate[T](n: Int, list: List[T]): List[T] = {
    list.flatMap(l => for (i <- 0 until n) yield l)
  }
}
