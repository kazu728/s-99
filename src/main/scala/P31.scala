object P31 {

  def isPrime(number: Int): Boolean = {

    val numberDividedByTwo: Int = Math.floor(number / 2).asInstanceOf[Int]

    for (i <- 2 to numberDividedByTwo) {
      if (number % i == 0) return false
    }
    true
  }
}
