import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun transformsMessage() {
        assertEquals("HELLO", transform("hello"))
    }
}
