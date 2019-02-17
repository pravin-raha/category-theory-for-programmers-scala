package category.instances.list

import category.Functor

object FunctorInstance {
  implicit val functorLIstInstance: Functor[List] = new Functor[List] {
    override def map[A, B](a: List[A])(f: A => B): List[B] =
      a match {
        case Nil => Nil
        case x :: Nil => f(x) :: Nil
        case x :: xs => map(xs)(f) :+ f(x)
      }
  }
}
