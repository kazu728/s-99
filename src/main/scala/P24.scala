import P20.removeAt

object P24 {

  def lotto(n: Int, s: Int): List[Int] = {

    def go(n: Int, list: List[Int]): List[Int] = {
      if (n == 0) List()
      else {
        val (rest, value) = removeAt((Math.random * list.size).toInt, list)
        value :: go(n - 1, rest)
      }
    }

    go(n, (for (i <- 1 to s) yield i).toList)
  }
}
