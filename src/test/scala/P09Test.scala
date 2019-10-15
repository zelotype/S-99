import org.scalatest.{FunSuite, Matchers}

class P09Test extends FunSuite with Matchers{
  test("return pack element in list") {
    P09.packList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
  }
}
