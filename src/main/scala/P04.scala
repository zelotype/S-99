object P04 {
  def lengthList[A](ls:List[A]):Int = {
    ls.length
  }
  def lengthListRecursive[A](ls:List[A]):Int = {
    def countList[A](countLs:List[A], count:Int):Int = countLs match {
      case Nil => count
      case _ :: tail => countList(tail, count+1)
    }
    countList(ls, 0)
  }
}
