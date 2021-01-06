import util._

object P55 {

  object Tree {
    def cBalanced[T](n: Int, value: T): List[Tree[T]] = {
      if (n == 0) List(End)
      else if (n % 2 == 0) {
        val left = cBalanced((n - 1) / 2, value)
        val right = cBalanced((n - 1) / 2 + 1, value)
        left.flatMap { l =>
          right.flatMap { r =>
            List(new Node(value, l, r), new Node(value, r, l))
          }
        }
      } else {
        val childrens = cBalanced(n / 2, value)
        for {
          l <- childrens
          r <- childrens
        } yield new Node(value, l, r)
      }
    }
  }
}
