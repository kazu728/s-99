object P22 {

  def createList(a: Int, b: Int, list: List[Int] = List()): List[Int] = {

    if (a == b) a :: list
    else {
      if (a < b) createList(a, b - 1, b :: list)
      else { createList(b, a - 1, a :: list) }
    }
  }
}
