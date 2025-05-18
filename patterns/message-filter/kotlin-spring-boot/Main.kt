
fun filterImportant(messages: List<String>): List<String> =
    messages.filter { it.contains("IMPORTANT") }

fun main() {
    val input = listOf("IMPORTANT: start", "skip this", "IMPORTANT: end")
    val output = filterImportant(input)
    output.forEach { println(it) }
}
