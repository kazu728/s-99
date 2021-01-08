object P25 {

  def randomPermute[T](list: List[T]): List[T] = {
    P23.randomSelect(list.size, list)
  }
}
