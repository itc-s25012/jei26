package d48;

public class Q25 {
    String code;  //フィールド(クラスが持つデータ)
    public static void main(String[] args){
        Q25 obj = new Q25();//Q25クラスをインスタンス化して、objという名前の変数に格納
        obj.setCode("FB1257");//objのsetCordのメソッドを使い、文字列をセットする
        System.out.println(obj.code); //確認用


    }
    void setCode(String s){ //引数で受け取った文字列をフィールド「code」に代入するメソッド
        code = s;

    }
}
//メモ
/*Javaでは文字列を指定する場合""(ダブルクォーテーション)で囲む必要がある
''(シングルクォーテーション)は、1文字だけ(char型)を扱うときに使うので、混合しない
 */
