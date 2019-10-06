object P05 {
  def reverseList[A](ls:List[A]):List[A] = ls.reverse

  def reverseListRecursive[A](ls: List[A]): List[A] = {
    def reverseInside[A](curLs:List[A], ans:List[A]):List[A] = curLs match {
      case Nil => ans
      case h :: tail => reverseInside(tail, h::ans)
      case _ => throw new NoSuchElementException
    }
    reverseInside(ls, Nil)
  }
}
