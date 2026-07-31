package d53;

public class Q22 {
    public static void main(String[] args) {
        for (int i = 1; i < 20; i++) {
            if(i % 3 == 0){     //3の倍数
                if(i % 5 == 0){ //5の倍数かつ3の倍数 ⇒ 15の倍数
                    break;      // i=15のときにループを抜ける(3*5=15が最小公倍数)
                }
            }
            if (i % 4 == 0){
                System.out.println(i + "");   // 4の倍数を出力
            }
        }
    }
}
