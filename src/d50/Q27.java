package d50;

public class Q27 {
    public static void main(String[] args){
        int control = 3;
        String mode;

        switch (control){
            case 1:
                mode = "Warm";
            case 2:
                mode = "Cool";
            default:
                mode = "Wind";
                break;
        }
        System.out.println(mode);
    }
}
