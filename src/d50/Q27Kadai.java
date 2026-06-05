package d50;

public class Q27Kadai {
    public static void main(String[] args){
        int control = 2;
        String mode;

        switch (control){
            case 1:
                mode = "Warm";
                break;
            case 2:
                mode = "Cool";
                break;
            default:
                mode = "Wind";
                break;
        }
        System.out.println(mode);
    }
}
