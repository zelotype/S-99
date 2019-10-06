object P06 {
  def checkPalindromeList[A](ls:List[A]):Boolean = {
    val rvList = ls.reverse
    rvList.equals(ls)
  }
}
