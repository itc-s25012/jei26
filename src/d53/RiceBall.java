package d53;

public class RiceBall {
    private String ingredients;
    private int n;
    RiceBall(String ingredients) {
        this.ingredients = ingredients;
        System.out.println(ingredients);//出力確認用
    }
    RiceBall(int n) {
        this.n = n;
        System.out.println("おにぎりを"+ n +"個食べました");   //出力確認用
    }
    public static void main(String[] args) {
        RiceBall ume = new RiceBall("梅干");
        RiceBall sake = new RiceBall("鮭");

        RiceBall o = new RiceBall(3);

    }
}
/*
【メモ】(13)コンストラクタはいくつでも定義できる
この演習のように、インスタンス化の際に異なる引数を指定したら、実行されるっコンストラクタが自動的に変わる
この仕組みを「オーバーロード」という。
 */
