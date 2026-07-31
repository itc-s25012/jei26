package d53;

public class Q24 {
    public static void main(String[] args) {
        for (int n = 0; n < 10; n++){
            System.out.println(n + " ");
            switch (n){
                case 2:
                    n *=3;
                    break;
                case 7:
                    n -= 3;
                    break;
                case 6:
                    n += 3;
                    break;
            }
        }
    }
}
/*
実際にメモを取りながら追うと良い。末尾のn++にも注意
n=0 出力：0 switch該当なし ⇒　n = 1
n=1 出力：1 switch該当なし ⇒　n = 2
n=2 出力：2 case 2: n *= 3 ⇒ n = 6 ⇒ n = 7
n=7 出力：7 case 7: n -= 3 ⇒ n = 4 ⇒ n = 5
n=5 出力：5 switch該当なし ⇒ n = 6
n=6 出力：6 case 6: n += 3 ⇒ n = 9 ⇒ n = 10
n=10 ⇒ 10 < 10はfalse ⇒　ループ終了
 */
