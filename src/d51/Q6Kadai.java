package d51;

// プログラムを動かすクラス
public class Q6Kadai {
    public static void main(String[] args) {

        // 大分類（魚類・肉類）を登録する
        Item[] li = { new Item("AA", "魚類"), new Item("BB", "肉類") };

        // 小分類（さば・さんま・牛肉など）を登録する
        Item[] si = {
                new Item("A1", "さば"),
                new Item("A2", "さんま"),
                new Item("B1", "牛肉"),
                new Item("B2", "鶏肉"),
                new Item("B3", "豚肉")
        };

        // 商品の情報を管理するオブジェクトを作る
        ItemMaster im = new ItemMaster(li, si);

        // 商品コードの最初の2文字を取り出す（大分類）
        String lcode = args[0].substring(0, 2);

        // 商品コードの3～4文字目を取り出す（小分類）
        String scode = args[0].substring(2, 4);

        // 残りの文字を取り出す（詳細コード）
        String details = args[0].substring(4);

        // 大分類コードから名前を調べる
        String lname = im.getItemName(im.MAJOR, lcode);

        // 小分類コードから名前を調べる
        String sname = im.getItemName(im.MINOR, scode);

        // 結果を表示する
        System.out.println("商品コード" + args[0]);
        System.out.println("大分類名:" + lname);
        System.out.println("小分類名:" + sname);
        System.out.println("詳細コード:" + details);
    }
}

// 商品のコードと名前を1つずつ保存するクラス
class Item {

    // 商品コードを入れる
    private String code;

    // 商品の名前を入れる
    private String name;

    // Itemを作るときにコードと名前を入れる
    Item(String code, String name){
        this.code = code;
        this.name = name;
    }

    // コードを取り出す
    public String getCode(){
        return code;
    }

    // 名前を取り出す
    public String getName(){
        return name;
    }
}

// 商品の一覧を管理するクラス
class ItemMaster{

    // 大分類は0番を使う
    public int MAJOR = 0;

    // 小分類は1番を使う
    public int MINOR = 1;

    // 大分類と小分類をまとめて保存する配列
    private Item[][] items;

    // 大分類と小分類を配列に入れる
    ItemMaster(Item[] major, Item[] minor){

        // 大分類用と小分類用の2つを用意する
        items = new Item[2][];

        // 0番に大分類を入れる
        items[MAJOR] = major;

        // 1番に小分類を入れる
        items[MINOR] = minor;
    }

    // コードを探して名前を返す
    public String getItemName(int codeLevel, String code){

        // 配列を最初から最後まで調べる
        for(int i = 0; i < items[codeLevel].length; i++){

            // コードが同じなら
            if(code.equals(items[codeLevel][i].getCode())){

                // 名前を返す
                return items[codeLevel][i].getName();
            }
        }

        // 見つからなかったら「(不明)」を返す
        return "(不明)";
    }
}
