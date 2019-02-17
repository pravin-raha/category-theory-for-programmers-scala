package category.syntax.monoid

import category.Functor

import scala.language.higherKinds

object FunctorSyntax {

  implicit class FunctorOps[F[_], A](a: F[A]) {
    def map[B](b: A => B)(implicit f: Functor[F]): F[B] = f.map(a)(b)
  }

}
