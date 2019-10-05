import org.scalatest.{FunSuite, Matchers}

class P04Test extends FunSuite with Matchers{
  test("Return reverse list") {
    P04.reverseList(List(1,2,3,4,5,6)) shouldEqual List(6,5,4,3,2,1)
  }
}
