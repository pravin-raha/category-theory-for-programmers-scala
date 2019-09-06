package category

trait BiFunctor[F[_, _]] {
  type id[A] = A

  def bimap[A, B, C, D](g: A => C)(h: B => D): F[A, B] => F[C, D] = first(g) compose second(h)

  def first[A, B, C](g: A => C): F[A, B] => F[C, B] = bimap(g)(identity[B])

  def second[A, B, D](h: B => D): F[A, B] => F[A, D] = bimap(identity[A])(h)
}
