package d50;

public class Q17 {
    public static void main(String[] args){
        float f = 7.8f; //7.8はfloat型ということを明示している
        double d = 15.37; //duobleの場合は省略するのがデフォルト

        double x = f * d; //異なる型の計算はより大きい型に自動変換される

        System.out.println(x);
        }
    }

