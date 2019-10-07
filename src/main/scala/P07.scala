object P07 {
  def flatten(ls: List[Any]): List[Any] = ls match {
    case Nil => Nil
    case (head: List[_]) :: tail => flatten(head) ::: flatten(tail)
    case head :: tail => head :: flatten(tail)
  }
}
