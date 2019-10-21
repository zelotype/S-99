import org.scalatest.{FunSuite, Matchers}

class P10Test extends FunSuite with Matchers {
  test("Return List[Int, Symbol] of seperate sublist"){
    P10.runLength(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)) shouldEqual List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
  }
}
