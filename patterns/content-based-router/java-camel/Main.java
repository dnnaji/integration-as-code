public class Main {

    static class Message {
        String type;
        String payload;

        Message(String type, String payload) {
            this.type = type;
            this.payload = payload;
        }
    }

    static String route(Message message) {
        if ("orders".equals(message.type)) {
            return "orders";
        } else if ("payments".equals(message.type)) {
            return "payments";
        }
        return "unknown";
    }

    public static void main(String[] args) {
        Message first = new Message("orders", "Create order 123");
        Message second = new Message("payments", "Process payment 99");
        Message third = new Message("other", "Something else");

        System.out.println(route(first));
        System.out.println(route(second));
        System.out.println(route(third));
    }
}
