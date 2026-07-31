package d53;

public class Q25 {
    public static void main(String[] args) {
        char[] ch = {'A','B','C'};
        String s1 = new String("ABC");
        String s2 = new String(ch); //s2="ABC"となる
        boolean b1 = s1 == s2;     // ==演算子は参照先が同じか判断する
        boolean b2 = s1.equals(s2);
        System.out.println(b1 + " " + b2);


    }
}
/*
s1とs2はそれぞれnew演算子を使ってインスタンス化しているのでメモリ領域は別となる
別々のメモリ空間に同じ「ABC」が格納されていることになる

そのため
s == s2 ⇒ false（参照先が異なるため）
s1.equals(s2) ⇒　true(値は同じ「ABC」のため)
よって出力結果は「false true」となる

Javaでは==演算子は参照型なら参照先(アドレス)を比較します
Javaでは==演算子は基本型なら値そのものを比較します
Pythonでは==演算子は値そのものを比較します。Javaとは拳動がことなります
混合しないように注意しましょう
 */
