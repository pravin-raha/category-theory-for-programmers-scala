package category

trait Printable[A] {
  def format(a: A): String
}

object Printable {
  def apply[A: Printable]: Printable[A] = implicitly[Printable[A]]
}
