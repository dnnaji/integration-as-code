object AggregatorRoute {
    /**
     * Aggregates quotes and counts duplicates.
     * Example output: {@code hello(2),world(1)}
     */
    fun aggregateQuotes(quotes: List<String>): String =
        quotes.groupingBy { it }
            .eachCount()
            .map { "${it.key}(${it.value})" }
            .joinToString(",")

    @JvmStatic
    fun main(args: Array<String>) {
        val quotes = listOf("hello", "world", "hello")
        println(aggregateQuotes(quotes))
    }
}
