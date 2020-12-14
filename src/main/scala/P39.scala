import P31.isPrime
import scala.annotation.tailrec

object P39 {

  @tailrec
  def makeIsPrimeNumberList(
      start: Int,
      end: Int,
      list: List[Int]
  ): List[Int] = {
    if (isPrime(end)) {
      if (start == end) end :: list
      else makeIsPrimeNumberList(start, end - 1, end :: list)
    } else {
      makeIsPrimeNumberList(start, end - 1, list)
    }
  }

  def listPrimesInRange(range: Range, list: List[Int] = List()) = {
    if (range.start == 1 && range.end == 1) List()
    else makeIsPrimeNumberList(range.start, range.end, list)
  }
}
