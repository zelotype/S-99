import org.scalatest.{FunSuite, Matchers}

class P06Test extends FunSuite with Matchers{
  test("return true when input palindrome list") {
    P06.checkPalindromeList(List(1,2,3,3,2,1)) shouldEqual true
  }
}
