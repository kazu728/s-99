object P12 {

  def decode[T](list: List[(Int, T)]): List[T] = {
    list.flatMap(l => for (i <- 0 until l._1) yield l._2)
  }
}
