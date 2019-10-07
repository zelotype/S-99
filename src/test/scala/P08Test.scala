import org.scalatest.{FunSuite, Matchers}

class P08Test extends FunSuite with Matchers{
  test("Return list contain repeated element with a single copy"){
    P08.compressList(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List('a, 'b, 'c, 'a, 'd, 'e)
  }
}
