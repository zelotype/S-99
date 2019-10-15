object P09 {
  def packList[A](ls:List[A]):List[List[A]] = {
    if (ls.isEmpty) List(List())
    else {
      val(packed, next) = ls span (_ == ls.head)
      if (next == Nil) List(packed)
      else packed :: packList(next)
    }
  }
}
