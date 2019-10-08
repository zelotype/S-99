import org.scalatest.{FunSuite, Matchers}

class P15Test extends FunSuite with Matchers{
  test("return duplicate element from given number in list"){
    P15.duplicateNumberElement(3, List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
  }
}
