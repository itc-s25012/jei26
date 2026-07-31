package d53;
public class Q21 {
    public static void main(String[] args) {
        byte b = 127; //127= 01111111
        b += 1;
        System.out.println(b);
    }
}
/*
[メモ]
byte型で表現できる値の表現
最大値127を8ビットで表現すると「01111111」となり、
これに1を加算すると「100000000」となり、一見したところ128だが
Javaでは先頭ビットが1の場合マイナスとして扱う。
　
 */