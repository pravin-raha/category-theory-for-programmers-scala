package category

trait Monoid[A] {
  def empty: A

  def combine(a: A, b: A): A
}
