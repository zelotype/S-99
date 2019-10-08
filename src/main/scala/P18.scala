object P18 {
  def sliceList[A](start:Int, stop:Int, ls:List[A]):List[A] = {
    def sliceRecursive[A](count:Int, curLs:List[A], result:List[A], check:Boolean):List[A] = (count, curLs, check) match {
      case (1, h::tail, false) => sliceRecursive(stop-start, tail, result, true)
      case (0, _, true) => result.reverse
      case (_, h::tail, false) => sliceRecursive(count-1, tail, result, false)
      case (_, h::tail, true) => sliceRecursive(count-1, tail, h::result, true)
      case (_, Nil, _) => result.reverse
    }
    sliceRecursive(start, ls, Nil, false)
  }
}
