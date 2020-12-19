object P31 {

  def isPrime(number: Int): Boolean = {
    val nums = 2 to number
    (number > 1) && nums
      .takeWhile(_ <= Math.sqrt(number))
      .forall(number % _ != 0)
  }
}
