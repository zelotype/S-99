object P08 {
  def compressList[A](ls:List[A]):List[A] = {
    def checkRepeatedElement[A](curLs:List[A], boxLs:List[A]):List[A] = curLs match {
      case head :: tail => checkRepeatedElement(tail.dropWhile(_ == head), head::boxLs)
      case Nil => boxLs
    }
    checkRepeatedElement(ls, Nil).reverse
  }
}
