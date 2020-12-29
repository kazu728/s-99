object P11 {

  def encodeModified[T](list: List[T]): List[Any] = {
    P10.encode(list).map(l => if (l._1 == 1) l._2 else l)
  }
}
