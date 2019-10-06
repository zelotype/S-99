object P03 {
  def indexElement[A](index:Int, ls:List[A]):A = {
    if (ls.isEmpty) {
      throw new NoSuchElementException
    }
    if (index < 0) {
      throw new IndexOutOfBoundsException
    }
    ls(index)
  }
  def indexElementVersion2[A](index:Int, ls:List[A]):A = (index, ls) match {
    case (0, h :: _) => h
    case (index, _ :: tail) => indexElementVersion2(index-1, tail)
    case _ => throw new NoSuchElementException
  }
}
