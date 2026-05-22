package d48;

public class Q26 {
    public static void main(String[] args){
        int i = 0, sum = 0;
        while(++i < 8){
            sum += i;
        }
        System.out.print(sum);
    }
}
/*
[動きの確認]
1回目:1が0から1に増える-> 1 < 8はOK ->sumに1を足す
(中略)
7回目:１が6から7に増える -> 7 < 8はOK ->sumに7を足す
8回目:1が7から8に増える -> 8 < 8 は NG
答えは 1+2+3+4+5+6+7で
「28」となる
[メモ]
++1(前):使う前に1増やす　
1++(後):使った後に1増やす
 */
