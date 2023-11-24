import kotlin.test.Test

class MyTest {

    @Test
    fun one() {
        assert("Bob".startsWith("B") && "Bob".endsWith("c"))
    }

    @Test
    fun two() {
        data class Role(val title: String)
        data class Person(val name: String, val role: Role)
        val people = listOf(
                Person("Joe", Role("Engineer")),
                Person("Sally", Role("Manager")),
                Person("Bob", Role("QA")),
        )

        assert(people.find { it.name == "Ralph" }?.role?.title.equals("qa"))
    }

}
