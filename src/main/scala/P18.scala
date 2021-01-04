object P18 {

  def slice[T](l: Int, k: Int, list: List[T]): List[T] = {

    list match {
      case x :: xs if l > 0      => slice(l - 1, k - 1, xs)
      case x :: xs if k > 0      => x :: slice(0, k - 1, xs)
      case x if l == 0 && k == 0 => List()
    }
  }
}
