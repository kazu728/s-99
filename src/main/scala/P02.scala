object P02 {

  def sencondToLast[T](list: List[T]): T = {
    list match {
      case (x :: xs :: Nil) => x
      case (x :: xs)        => sencondToLast(xs)
      case _                => sys.error("Invalid args")
    }
  }
}
