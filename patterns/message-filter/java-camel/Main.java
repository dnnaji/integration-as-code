import java.util.List;
import java.util.stream.Collectors;

public class Main {

    static List<String> filterImportant(List<String> messages) {
        return messages.stream()
                .filter(m -> m.contains("IMPORTANT"))
                .collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<String> input = List.of("IMPORTANT: start", "skip this", "IMPORTANT: end");
        List<String> output = filterImportant(input);
        output.forEach(System.out::println);
    }
}
