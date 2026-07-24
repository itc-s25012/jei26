package d52;

public class Q6 {
    public static void main(String[] args) {
        Drink[] dr = {
                new Drink("Gomacola", 150),
                new Drink("MrPepper", 130),
                new Drink("Saltwater", 320)
        };
        VendingMachine vm = new VendingMachine(dr);
        vm.display();
        vm.execCom("i 100");
        vm.execCom("p 2");
        vm.execCom("i 500");
        vm.execCom("p 3");
        vm.execCom("c 0");
    }
}

class Drink {
    private String name;
    private int price;

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }
    public int getPrice() { return price; }
    public String toString() {
        return "[" + name + "] " + price + "円";
    }
}
//自動販売機をシュミレートするクラス
class VendingMachine {
    private Drink[] drinks;    //販売する清涼飲料水を管理する配列
    private int cash = 0;      //投入額(2:初期値は0)
    private int[] coins = {500, 100, 50, 10};    //自動販売機が受け付ける効果を管理

    VendingMachine(Drink[] drinks) {     //コンストラクターはクラス名とメソッド名を合わせる配列
        this.drinks = drinks;            //オブジェクト(参照型)でも基本型と同じように扱える
    }

    public void display() {     //5:説明文にある形式で販売する清涼飲料水を一番めから順に表示する
        int idx = 1;            //
        for (Drink drink : drinks) {
            System.out.println("[" + idx + "] " + drink);
            idx++;             //
        }
    }

    public void execCom(String command) {    //引数のコマンドを解釈し、適切な処理を行う
        String[] s = command.split(" ");//半角スペースで分割
        switch (s[0]) { // 3: コマンド(i, p, c)を解釈したいため
            case "i":   //投入コマンド
                if (isCoin(s[1])) cash += Integer.parseInt(s[1]); //isCoin()がtrueの処理
                break;
            case "p":   //購入コマンド
                int idx = Integer.parseInt(s[1]) - 1;        //指定された番号を配列で扱えるよう-1にしている
                if (idx < 0 || idx >= drinks.length) return; //3.②:数値情報が1未満(0以下)またはn(drinks.length)を超える場合は何もしない
                int price = drinks[idx].getPrice();          //選択された清涼飲料水の価格を取得
                if (price <= cash) {  //価格(price)が投入額(cash)以下ならば
                    eject(idx);       //ejectメソッドの実行(清涼飲料水が排出されました)
                    cash -= price;    //cashの更新
                    payChange();      //お釣りの払い出すpayChangeメソッドの実行
                } else {              //お金が足りなければ
                    System.out.println("お金が足りません");
                }
                break;
            case "c":          //お釣りコマンドのcase
                payChange();   //お釣りの払い出すpayChangeメソッドの実行
                break;
            default:
                break;
        }
    }

    private boolean isCoin(String s) {   //引数をの金額が、自動販売機が受け入れるいずれかの金額に等しい場合だけtrueをかえす
        int c = Integer.parseInt(s);    //文字列を整数に変換
        for (int coin : coins) {       // いずれかの金額はメンバー変数coinsで指定されている
            if (c == coin) return true;
        }
        return false;
    }

    private void eject(int idx) {  //
        System.out.println(drinks[idx] + " が排出されました");
    }

    private void payChange() {
        if (cash == 0) {
            System.out.println("お釣り なし");
            return;
        }
        String s = "お釣り ";
        for (int coin : coins) {
            if (cash / coin > 0) {  //投入額cash /扱える金額coinが0よりも大きい場合
                s += coin + "円:" + (cash / coin) + "枚 ";  //下記メモで詳しく
                cash %= coin; // cashをcoinで割った余りをcashに上書き(下記メモで詳しく)
            }
        }
        System.out.println(s);
    }
}
/*
[メモ](37)の計算について
投入額600円で320円のSaltWaterを購入した場合、お釣りは280円だが
排出されるお釣りは100円が2枚,50円が1枚,10円が3枚となる
100円2枚を排出した場合は80円となるが、この80円を求める際に
cash %=coin(cash = cash % coin)をしている

試験本番で(37)のような計算に時間がかかりそうな問題がでてきたら、
時間配分的に後回しにしても良いかもしれません

また、計算問題を解く際、メモ用紙と筆記用具があると非常に便利です
<試験ではJShellやテキストエディタも使えません>

 */
