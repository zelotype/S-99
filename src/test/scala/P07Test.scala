import org.scalatest.{FunSuite, Matchers}

class P07Test extends FunSuite with Matchers {
  test("Return flatten list") {
    P07.flatten(List((List(1, 1), 2, List(3, List(5, 8))))) shouldEqual List(1, 1, 2, 3, 5, 8)
  }
}
