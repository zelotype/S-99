object P02 {
  def lastButOne[A](ls: List[A]): A = {
    val box = ls.head
    def inner(ls: List[A], box: A): A = ls match {
      case _ :: Nil => box
      case h :: tail => inner(tail, h)
      case _ => throw new NoSuchElementException
    }
    inner(ls, box)
  }
  def lastButOneVersion2[A](ls: List[A]):A = ls match {
    case h :: _ :: Nil => h
    case _ :: tail => lastButOneVersion2(tail)
    case _ => throw new NoSuchElementException
  }
}
