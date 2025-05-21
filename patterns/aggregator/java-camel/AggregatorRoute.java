import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class AggregatorRoute {
    /**
     * Aggregate quotes while counting duplicates.
     * <p>
     * Example output: {@code hello(2),world(1)}
     */
    public static String aggregateQuotes(String[] quotes) {
        Map<String, Long> counts = Arrays.stream(quotes)
                .collect(Collectors.groupingBy(q -> q, LinkedHashMap::new, Collectors.counting()));
        return counts.entrySet().stream()
                .map(e -> e.getKey() + "(" + e.getValue() + ")")
                .collect(Collectors.joining(","));
    }

    public static void main(String[] args) {
        String[] quotes = {"hello", "world", "hello"};
        System.out.println(aggregateQuotes(quotes));
    }
}
