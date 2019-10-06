import org.scalatest.{FunSuite, Matchers}

class P05Test extends FunSuite with Matchers{
  test("Return reverse list") {
    P05.reverseList(List(1,2,3,4,5,6)) shouldEqual List(6,5,4,3,2,1)
  }
  test("Return reverse list -- version 2") {
    P05.reverseListRecursive(List(1,2,3,4,5,6)) shouldEqual List(6,5,4,3,2,1)
  }
}
