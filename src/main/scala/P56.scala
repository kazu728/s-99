import util.{Node, Tree, End}

object P56 {

  implicit class RichTree[T](tree: Tree[T]) {

    def isMirrorOf(another: Tree[T]): Boolean = {
      (tree, another) match {
        case (End, End) => true
        case (End, _)   => false
        case (_, End)   => false
        case (Node(_, l1, r1), Node(_, l2, r2)) =>
          l1.isMirrorOf(r2) && r1.isMirrorOf(l2)
      }
    }
  }

  def isSymmetric[T](tree: Tree[T]): Boolean = {
    tree match {
      case Node(value, left, right) => left.isMirrorOf(right)
      case End                      => false
    }
  }
}
