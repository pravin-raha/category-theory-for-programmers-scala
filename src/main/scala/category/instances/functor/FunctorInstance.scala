package category.instances.functor

import category.Functor
import category.adt._

object FunctorInstance {
  implicit val functorListInstance: Functor[List] = new Functor[List] {
    override def map[A, B](a: List[A])(f: A => B): List[B] =
      a match {
        case Nil      => Nil
        case x :: Nil => f(x) :: Nil
        case x :: xs  => map(xs)(f) :+ f(x)
      }
  }

  implicit val functorMaybeInstance: Functor[Maybe] =
    new Functor[Maybe] {
      def map[A, B](a: Maybe[A])(f: A => B): Maybe[B] = a match {
        case Empty   => Empty
        case Just(x) => Just(f(x))
      }
    }

}
