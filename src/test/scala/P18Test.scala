import org.scalatest.{FunSuite, Matchers}

class P18Test extends FunSuite with Matchers{
  test("return list have slice") {
    P18.sliceList(3, 7, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k)) shouldEqual List('d, 'e, 'f, 'g)
  }
}
