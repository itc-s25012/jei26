package d49;

public class Q22Kadai {
    public static void main(String[] args) {
        int length = 2500;
        String type;

        if (length < 1000) {
            type = "Snort";
        } else if (length > 2000) {
            type = "Long";
        } else {
            type = "Standard";
        }

        System.out.println(type);
    }
}
