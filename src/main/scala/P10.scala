object P10 {
  def encode[T](list: List[T]): List[(Int, T)] = {
    P09.pack(list).map(l => (l.length, l.head))
  }
}