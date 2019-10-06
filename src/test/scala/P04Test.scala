import org.scalatest.{FunSuite, Matchers}

class P04Test extends FunSuite with Matchers{
  test("return length of list") {
    P04.lengthList(List(1,2,3,4,5,6,6,7,8,8)) shouldEqual 10
  }
  test("return length of list -- version 2") {
    P04.lengthListRecursive(List(1,2,3,4,5,6,6,7,8,8)) shouldEqual 10
  }
  test("return 0 when input Nil") {
    P04.lengthList(List())
  }
  test("return 0 when input Nil -- version 2") {
    P04.lengthListRecursive(List())
  }
}
