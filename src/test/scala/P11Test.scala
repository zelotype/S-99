import org.scalatest.{FunSuite, Matchers}

class P11Test extends FunSuite with Matchers{
  test("Return list[Int, A] if int = 1 return A only"){
    P11.runLengthModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
  }
}
