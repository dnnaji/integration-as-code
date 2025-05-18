import kotlin.test.Test
import kotlin.test.assertEquals

class MainTest {
    @Test
    fun routesOrders() {
        val msg = Message("orders", "payload")
        assertEquals("orders", route(msg))
    }

    @Test
    fun routesPayments() {
        val msg = Message("payments", "payload")
        assertEquals("payments", route(msg))
    }

    @Test
    fun routesUnknown() {
        val msg = Message("other", "payload")
        assertEquals("unknown", route(msg))
    }
}
