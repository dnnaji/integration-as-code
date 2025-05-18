import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    @Test
    public void transformsMessage() {
        assertEquals("HELLO", Main.transform("hello"));
    }
}
