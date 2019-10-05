object P02 {
  def lastButOne[A](ls: List[A]): A = {
    if(ls.isEmpty) {
      throw new NoSuchElementException
    }
    val box = ls.head
    def inner(ls: List[A], box: A): A = ls match {
      case _ :: Nil => box
      case h :: tail => inner(tail, h)
    }
    inner(ls, box)
  }
}
