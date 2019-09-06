package category.instances.monoid

import category.Monoid
import category.instances.monid.MonoidInstance._
import category.syntax.monoid.MonoidSyntax._
import org.scalatest.FlatSpec

class MonoidInstanceTest extends FlatSpec {

  "A MonoidInstance" should "append two string" in {
    assert(("hello" |+| "world") == "helloworld")
  }

  it should "return empty value" in {
    assert(Monoid[String].empty == "")
  }
}
