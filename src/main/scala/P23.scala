import P20.removeAt

object P23 {

  def randomSelect[T](n: Int, list: List[T]): List[T] = {
    def go(n: Int, list: List[T]): List[T] = {
      if (n == 0) List()
      else {
        list match {
          case Nil => sys.error("")
          case x :: xs => {
            val (rest, value) =
              removeAt((Math.random() * list.size).toInt, list)
            value :: go(n - 1, rest)
          }
        }
      }
    }

    go(n, list)
  }
}
