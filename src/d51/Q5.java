package d51;

public class Q5 {
    public static void main(String[] args) {
        double[] level = {0.0, 24.0, 57.0, Double.MAX_VALUE}; // 2.①:使用量のレベル
        double[] unit = {0.0, 2.0, 3.0, 5.0}; // 2.①:単位数
        int[] rate = {0, 19, 17, 14}; // 2.①：従量料金単価
        if(args.length != 1){ // 1：実測値が一つ以外の場合のエラー処理
            System.out.println("引数の個数が不正");
            return; // プログラムを終了
        }
        double amount = Double.parseDouble(args[0]); // コマンドラインから受け取ったガス使用量を実数(double)に変換してamountに代入
        if(amount < 0.0){ // 1：実測値が負の値だった場合のエラー処理
            System.out.println("0.0以上の使用量を入力");
            return; // プログラムを終了
        }

        int i, price = 1200; // 2．②：priceの初期値の基本使用料(1200円)を代入しておく
        for(i = 1; amount >= level[i]; i++){ // 使用量ごとに料金を算出するための繰り返し
            price += (int)((level[i] - level[i - 1]) / unit[i]) * rate[i]; // 2．④：計算式を使って使用量ごとの従量料金を求め、priceに合計している
        }

        // forループ後、残りの従量料金を加算する
        // iはforループ外で宣言されているためループ後も値が保持されている（スコープ）
        // amountは実際の総使用量。level[i - 1]を引くことで、forループで処理済みの範囲を除いた残りの使用量を求めている
        price += (int)Math.ceil((amount - level[i - 1]) / unit[i]) * rate[i]; // 2．④：小数点以下の切り上げにMath.ceil()を使う
        System.out.println("今月のガス料金 " + price + " 円");
    }
}