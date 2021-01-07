import util.{Tree, Node, End}

object P61 {

  implicit class RichTree[T](tree: Tree[T]) {

    def leafCount: Int = {
      tree match {
        case Node(_, End, End)        => 1
        case Node(value, left, right) => left.leafCount + right.leafCount
        case End                      => 0
      }
    }
  }
}
