package d53;

public class Q5 {

    // 消費税率を入れた配列
    // 0番目が食品(8%)、1番目がその他(10%)
    private static int[] taxes = {8, 10};

    // 配列の何番目を使うかを表す定数
    private static int FOODS = 0;
    private static int OTHER = 1;

    public static void main(String[] args) {

        // コマンドライン引数の最初の値(文字)を数字に変えてデータ数にする
        int dataSize = Integer.parseInt(args[0]);

        // 商品名を入れる配列
        String[] names = new String[dataSize];

        // 単価を入れる配列
        int[] prices = new int[dataSize];

        // 数量を入れる配列
        int[] nums = new int[dataSize];

        // タイプ(fまたはo)を入れる配列
        char[] types = new char[dataSize];

        // args[1]からデータを読み始める
        int argsIdx = 1;

        // データ数分だけ繰り返す
        for (int i = 0; i < dataSize; i++) {

            // 商品名を取り出す
            names[i] = args[argsIdx++];

            // 単価を文字から数字に変えて保存する
            prices[i] = Integer.parseInt(args[argsIdx++]);

            // 数量を文字から数字に変えて保存する
            nums[i] = Integer.parseInt(args[argsIdx++]);

            // タイプ(fまたはo)を1文字だけ取り出す
            types[i] = args[argsIdx++].charAt(0);
        }

        // 表の見出しを表示
        System.out.println("商品名\t税抜\t税込\tタイプ");

        // 商品ごとに計算する
        for (int i = 0; i < dataSize; i++) {

            // 税抜価格 = 単価 × 数量
            int zeinuki = prices[i] * nums[i];

            // 税込価格と税率の種類を入れる変数
            int zeikomi, taxType;

            // fなら食品(8%)、それ以外はその他(10%)
            taxType = types[i] == 'f' ? FOODS : OTHER;

            // 税込価格を計算する
            zeikomi = zeinuki * (taxes[taxType] + 100) / 100;

            // 結果を表示
            System.out.print(names[i] + "\t" + zeinuki + "円\t");
            System.out.println(zeikomi + "円\t" + viewType(types[i]));
        }
    }

    // fなら「食品等」、それ以外なら「その他」を返すメソッド
    private static String viewType(char c) {
        return c == 'f' ? "食品等" : "その他";
    }
}