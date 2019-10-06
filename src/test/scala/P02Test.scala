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
  test("return last-1 element from list -- version 2") {
    P02.lastButOneVersion2(List(1,2,3,4,5)) shouldEqual 4
  }
  test("Return NoSuchElementException If List doesn't have element -- version 2"){
    assertThrows[NoSuchElementException]{
      P02.lastButOneVersion2(List())
    }
  }
}
