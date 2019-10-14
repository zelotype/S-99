import org.scalatest.{FunSuite, Matchers}

class YWCTest extends FunSuite with Matchers{
  test("Return card at n index"){
    YWC.cardAt(34) shouldEqual "0H"
  }
}
