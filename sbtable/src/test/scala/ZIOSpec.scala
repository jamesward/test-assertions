import zio.test.*
import zio.test.Assertion.*

object ZIOSpec extends ZIOSpecDefault:
  def spec = suite("My")(
    test("stuff") {
      case class Role(title: String)
      case class Person(name: String, role: Role)
      val people = Seq(
        Person("Joe", Role("Engineer")),
        Person("Sally", Role("Manager")),
        Person("Bob", Role("QA"))
      )
      val rightSomeTwo: Either[_, Option[Int]] = Right(Some(2))

      assert(people.size)(equalTo(3)) &&
      assert(people)(hasSize(equalTo(3))) &&
      // vs
      assertTrue(people.size == 3) &&
      //
      //
      assert(people)(exists(hasField("role", _.role.title, equalTo("Engineer")))) &&
      // vs
      assertTrue(people.exists(_.role.title == "Engineer")) &&
      //
      //
      assert(people.head.role.title)(equalTo("Engineer")) &&
      // vs
      assertTrue(people.head.role.title == "Engineer") &&
      //
      //
      assert(rightSomeTwo)(isRight(isSome(equalTo(2)))) &&
      // vs
      assertTrue(rightSomeTwo.exists(_.contains(2))) &&
      //
      //
      assert(people.find(_.name == "Ralph"))(isSome(hasField("title", _.role.title, equalsIgnoreCase("qa")))) &&
      // vs
      assertTrue(people.find(_.name == "Ralph").get.role.title.equalsIgnoreCase("qa"))
    }
  )
