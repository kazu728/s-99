object P33 {

  def isCoprime(a: Int, b: Int, divider: Int, coprime: Boolean): Boolean = {

    if (a > divider && coprime) {
      if (a % divider == 1) isCoprime(a, b, divider + 1, true)
      else {
        if (b % divider == 1) isCoprime(a, b, divider + 1, true)
        else isCoprime(a, b, divider, false)
      }
    }

    coprime
  }
}
