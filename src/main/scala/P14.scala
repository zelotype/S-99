object P14 {
  def duplicateElement[A](ls:List[A]):List[A] = ls flatMap(e => List(e, e))
}
