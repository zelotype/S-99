import org.scalatest.{FunSuite, Matchers}

class P01Test extends FunSuite with Matchers {

  test("A method lastElement must return a last value in list") {
    val ls = List(3,4,6,9)
//    assert(P01.lastElement(ls) == 9)
    P01.lastElement(ls) shouldEqual 9
  }

  test("If no element in list, throw NoSuchElement exception") {
    assertThrows[NoSuchElementException]{
      P01.lastElement(List())
    }
  }
}
