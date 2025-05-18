import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun filtersImportantMessages() {
        val input = listOf("IMPORTANT: start", "skip this", "IMPORTANT: end")
        val output = filterImportant(input)
        assertEquals(listOf("IMPORTANT: start", "IMPORTANT: end"), output)
    }
}
