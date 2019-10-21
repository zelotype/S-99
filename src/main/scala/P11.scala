object P11 {
  import P10.runLength
  def runLengthModified[A](ls:List[A]):List[Any] = {
    runLength(ls) map {x => if (x._1 == 1) x._2 else x}
  }
}
