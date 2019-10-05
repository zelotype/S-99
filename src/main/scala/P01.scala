import java.util.NoSuchElementException

object P01 {
  def lastElement[A](ls:List[A]):A = ls match {
    case h::Nil => h
    case _::tail => lastElement(tail)
    case _ => throw new NoSuchElementException
  }
}
