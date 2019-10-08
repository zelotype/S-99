object P17 {
  def splitList[A](length:Int, ls:List[A]):(List[A], List[A]) = {
    def splitRecursive[A](count:Int, curLs:List[A], result: List[A]):(List[A], List[A]) = (count, curLs) match {
      case (0, tail) => (result.reverse, tail)
      case (_, h::tail) => splitRecursive(count-1, tail, h::result)
      case (_ ,  Nil) => (result.reverse, Nil)
    }
    splitRecursive(length, ls, Nil)
  }
  def splitListBuiltIn[A](length:Int, ls:List[A]):(List[A], List[A]) = ls.splitAt(length)
}
