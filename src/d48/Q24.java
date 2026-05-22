package d48;

public class Q24 {
    public static void main(String[] ages){
        for (int i = 0; i < 9; i++){
            if (i % 3 != 0){
                continue;
            }
            System.out.print(i);
        }
    }
}
