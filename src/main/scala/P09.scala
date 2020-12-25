object P09 {
  def pack[T](list: List[T]): List[List[T]] = {
    if (list.isEmpty) List(List())
    else {
      val (packed, next) = list span { _ == list.head }
      if (next == Nil) List(packed) else packed :: pack(next)
    }
  }
}
