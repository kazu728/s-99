object P14 {

  def duplicate[T](list: List[T]): List[T] = list.flatMap(l => List(l, l))
}
