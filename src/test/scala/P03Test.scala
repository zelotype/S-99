import org.scalatest.{FunSuite, Matchers}

class P03Test extends FunSuite with Matchers{
  test("Return index element from list") {
    P03.indexElement(2, List(1,2,2,3,4,6)) shouldEqual 2
  }
  test("Return first element from list") {
    P03.indexElement(0, List(7,5,3,5,6,8,8,7)) shouldEqual 7
  }
  test("Return NoSuchElementException if no element in list") {
    assertThrows[NoSuchElementException] {
      P03.indexElement(5, List())
    }
  }
  test("Return IndexOutOfBoundsException if index < 0"){
    assertThrows[IndexOutOfBoundsException] {
      P03.indexElement(-3, List(2,3,5,6,8,8))
    }
  }
  test("Return index element from list -- version 2") {
    P03.indexElement(4, List(7,5,3,5,6,8,8,7)) shouldEqual 6
  }
  test("Return NoSuchElementException if no element in list -- version 2") {
    assertThrows[NoSuchElementException] {
      P03.indexElement(5, List())
    }
  }
}
