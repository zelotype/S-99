import org.scalatest.{FunSuite, Matchers}

class P02Test extends FunSuite with Matchers{
  test("Return last-1 element from list"){
    P02.lastButOne(List(1,4,7,9)) shouldEqual 7
  }
  test("Return NoSuchElementException If List doesn't have element"){
    assertThrows[NoSuchElementException]{
      P02.lastButOne(List())
    }
  }
}
