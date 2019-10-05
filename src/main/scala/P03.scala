object P03 {
  def indexElement[A](index:Int, ls:List[A]):A = {
    if (ls.isEmpty) {
      throw new NoSuchElementException
    }
    else if (index < 0) {
      throw new IndexOutOfBoundsException
    }
    ls(index)
  }
}
