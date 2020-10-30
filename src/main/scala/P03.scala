object P03 {

  def findByIndex[T](index: Int, list: List[T]): T = {
    list match {
      case x :: xs if index == 0 => x
      case x :: xs if index > 0  => findByIndex(index - 1, xs)
      case _                     => sys.error("Invalid args")
    }
  }
}
