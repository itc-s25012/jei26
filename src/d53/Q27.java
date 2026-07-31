package d53;
enum Udon{
    KAKE("かけ",290), KITSUNE("きつね",-380) , CURRY("カレー" , 490);
    private String japaneseName;       //コンストラクタより、各定数の１番目に定義される
    int price;                        // コンストラクタより、各定数の２番目に定義される
    Udon(String japaneseName,int price){      //enum定数が呼び出される際に実行されるコマンド
        this.japaneseName = japaneseName;
        if(price >= 0){    //priseが正の数
            this.price = price;    //引数をフィールドに代入
        }else {       //負の数ならば
            this.price = -1 * price; //引数を正の数(-1かける)にフィールドに代入
        }
    }
    public String toString(){       //System.out.println()などで暗黙的に呼び出される特別な
        return japaneseName + "," + "円";
    }
}
public class Q27 {
    public static void main(String[] args) {
        System.out.println(Udon.KITSUNE);
    }
}
