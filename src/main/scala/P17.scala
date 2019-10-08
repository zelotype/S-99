object P17 {
//  def splitList[A](length:Int, ls:List[A]):List[A] = {
//    def splitRecursive[A](count:Int, curLs:List[A], result: List[A]):List[A] = (length, curLs) match {
//      case (1, h::tail) =>
//    }
//    splitRecursive(length, ls, Nil)
//  }
  def splitListBuiltIn[A](length:Int, ls:List[A]):(List[A], List[A]) = ls.splitAt(length)
}
