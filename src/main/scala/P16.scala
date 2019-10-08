object P16 {
  def dropNthElement[A](num:Int, ls:List[A]):List[A] = {
    def dropRecursive[A](count:Int, curLs:List[A], result:List[A]):List[A] = (count, curLs) match {
      case (1, _::tail) => dropRecursive(num, tail, result)
      case (_, h::tail) => dropRecursive(count-1, tail, h::result)
      case (_, Nil) => result.reverse
    }
    dropRecursive(num, ls, Nil)
  }
}
