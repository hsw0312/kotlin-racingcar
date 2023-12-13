import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class PersonTest {
//    @Test
//    fun getName() {
//    }
//
//    @Test
//    fun getAge() {
//    }
//
//    @Test
//    fun getNickname() {
//    }
//
//    @Test
//    fun setNickname() {
//    }
    @Test
    fun `named arguments` () {
        val person = listOf(
            Person("원동재", 32,"피터"),
            Person("원동재", 32, nickname = "피터"),
            Person(name = "원동재", nickname = "피터", age=32)
        )
        assertThat(people).allSatisfy {
            assertThat(it.name).isEqualTo("원동재")
            assertThat(it.age).isEqualTo(32)
            assertThat(it.nickname).isEqualTo("피터")
        }
    }
    @Test
    fun `default arguments`() {
        val person = Person("원동재")
        assertAll(
            {assertThat(person.name).isEqualTo("원동재")},
            {assertThat(person.age).isNull()},
            {assertThat(person.nickname).isNull()}
        )
    }

    @Test
    fun `data classes`() {
        val person1 = Person("원동재", 32, "피터")
        val person2 = Person("원동재", 32, "피터")
        assertThat(person1).isEqualTo(person2)
    }
}