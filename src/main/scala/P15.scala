object P15 {
  def duplicateNumberElement[A](num:Int, ls:List[A]):List[A] = ls flatMap { List.fill(num)(_) }
}
