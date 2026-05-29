package d49;
public class Q27Rensyuu {
    public static void main(String[] args){
        int num[] = {1,2,3,4,5};

        // 通常のfor文
        for(int i = 0; i < num.length; i++){
            System.out.println(num[i]);
        }

        int sum = 0;

        // 拡張for文
        for(int n : num){
            sum += n;
        }

        System.out.println(sum);
    }
}
//Javaは静的型付け言語