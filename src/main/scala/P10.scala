object P10 {
  import P09.packList
  def runLength[A](ls:List[A]):List[(Int, A)] = {
    packList(ls) map {x => (x.length, x.head)}
  }
}
