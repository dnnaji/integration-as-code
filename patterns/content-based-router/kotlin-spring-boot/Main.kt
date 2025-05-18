
data class Message(val type: String, val payload: String)

fun route(message: Message): String = when (message.type) {
    "orders" -> "orders"
    "payments" -> "payments"
    else -> "unknown"
}

fun main() {
    val first = Message("orders", "Create order 123")
    val second = Message("payments", "Process payment 99")
    val third = Message("other", "Something else")

    println(route(first))
    println(route(second))
    println(route(third))
}
