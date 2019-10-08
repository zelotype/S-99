import org.scalatest.{FunSuite, Matchers}

class P16Test extends FunSuite with Matchers{
  test("return list that drop every nth element") {
    P16.dropNthElement(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
  }
}
