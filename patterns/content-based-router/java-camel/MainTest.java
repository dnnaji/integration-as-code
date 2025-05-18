import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void routesOrders() {
        Main.Message msg = new Main.Message("orders", "payload");
        assertEquals("orders", Main.route(msg));
    }

    @Test
    public void routesPayments() {
        Main.Message msg = new Main.Message("payments", "payload");
        assertEquals("payments", Main.route(msg));
    }

    @Test
    public void routesUnknown() {
        Main.Message msg = new Main.Message("other", "payload");
        assertEquals("unknown", Main.route(msg));
    }
}
