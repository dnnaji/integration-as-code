import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class MainTest {
    @Test
    public void filtersImportantMessages() {
        List<String> input = List.of("IMPORTANT: start", "skip this", "IMPORTANT: end");
        List<String> output = Main.filterImportant(input);
        assertEquals(List.of("IMPORTANT: start", "IMPORTANT: end"), output);
    }
}
