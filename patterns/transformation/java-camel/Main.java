import java.util.Locale;

public class Main {

    static String transform(String message) {
        return message.toUpperCase(Locale.ROOT);
    }

    public static void main(String[] args) {
        String input = "Hello world";
        String output = transform(input);
        System.out.println(output);
    }
}
