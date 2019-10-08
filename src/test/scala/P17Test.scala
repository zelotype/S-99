import org.scalatest.{FunSuite, Matchers}

class P17Test extends FunSuite with Matchers{
  test("return 2 list that split from the length was given") {
    P17.splitListBuiltIn(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
  }
}
