object YWC {
  def cardAt(index:Int): String = {
    val suit = List('C', 'D', 'H', 'S')
    val num = List('2', '3', '4', '5', '6', '7', '8', '9', '0', 'J', 'Q', 'K', 'A')
    val cardList = suit.flatMap(x => num.map(y => (y, x))).map(t => s"${t._1}${t._2}")
    return cardList(index)
  }
}
