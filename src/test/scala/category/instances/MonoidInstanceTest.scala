package category.instances

import category.Monoid
import org.scalatest.FlatSpec
import category.syntax.monoid.MonoidSyntax._
import category.instances.monid.MonoidInstance._

class MonoidInstanceTest extends FlatSpec {

  "A MonoidInstance" should "append two string" in {
    assert(("hello" |+| "world") == "helloworld")
  }

  it should "return empty value" in {
    assert(Monoid[String].empty == "")
  }
}
