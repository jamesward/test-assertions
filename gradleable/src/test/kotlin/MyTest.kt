import kotlin.test.Test

fun assertTrue(value: Boolean?, message: String = "value was null") {
    if (value != null) {
        assert(value) { message }
    }
    else {
        throw AssertionError(message)
    }
}

class MyTest {

    @Test
    fun one() {
        data class Role(val title: String)
        data class Person(val name: String, val role: Role)
        val people = listOf(
                Person("Joe", Role("Engineer")),
                Person("Sally", Role("Manager")),
                Person("Bob", Role("QA")),
        )

        assertTrue(people.find { it.name == "Ralph" }?.role?.title == "qa")
    }

}
