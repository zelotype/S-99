import org.scalatest.{FunSuite, Matchers}

class P14Test extends FunSuite with Matchers{
  test("return duplicate element in list") {
    P14.duplicateElement(List('a, 'b, 'c, 'c, 'd)) shouldEqual List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
  }
}
