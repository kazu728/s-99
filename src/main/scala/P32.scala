object P32 {

  def gcd(a: Int, b: Int): Int = {

    def divide(divided: Int, divinding: Int): Int = {
      divinding match {
        case 0 => divided
        case _ => divide(divinding, Math.floorMod(divided, divinding))
      }
    }
    if (a == 0 || b == 0) sys.error("Invalid args")
    if (a > b) divide(a, b) else divide(b, a)
  }
}
