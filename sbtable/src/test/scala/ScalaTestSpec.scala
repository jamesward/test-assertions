import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers._

class ScalaTestSpec extends AnyFlatSpec {

  it should "dsl" in {
    "Bob" should (startWith ("B") and endWith ("c"))
  }

  it should "boolean" in {
    ("Bob".startsWith("B") && "Bob".endsWith("c")) should be (true)
  }

  it should "macro" in {
    assert("Bob".startsWith("B") && "Bob".endsWith("c"))
  }

  case class Role(title: String)

  case class Person(name: String, role: Role)

  val people = Seq(
    Person("Joe", Role("Engineer")),
    Person("Sally", Role("Manager")),
    Person("Bob", Role("QA"))
  )

  it should "be nice" in {
    assert(people.find(_.name == "Ralph").get.role.title.equalsIgnoreCase("qa"))
  }

}
