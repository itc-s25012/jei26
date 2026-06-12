package d50;

// 実行用クラス
public class Q6 {
    static void main(String[] args) {
        int min = Integer.parseInt(args[0]); // コマンドライン引数を整数に変換して格納
        int max = Integer.parseInt(args[1]); // コマンドライン引数を整数に変換して格納
        if(max < min){ // max<minなら入れ替える
            int tmp = max;
            max = min;
            min = tmp;
        }

        PrimeNumbers primeNumbers = new PrimeNumbers(); // オブジェクトの作成
        primeNumbers.initializePrimeNumbers(max); // 下記メソッドの設計より引数にmaxを指定することがわかる
        int[] part = primeNumbers.getPart(min, max); // 下記メソッドの設計により引数にmin, maxを指定することがわかる

        // 拡張for文を使い配列partのすべての要素を出力
        for(int prime : part){
            System.out.printf("%d, ", prime);
        }
    }
}

// 素数判定配列を保持し、指定された配列の素数を求めるクラス
class PrimeNumbers {
    boolean[] isPrimeNumbers; // 素数判定配列

    // 素数判定配列を設定するメソッド
    void initializePrimeNumbers(int max){
        isPrimeNumbers = new boolean[max + 1]; // 4.①: 最大値+1を要素数とする素数判定配列を用意する
        for(int i = 2; i <= max; i++){ // 2から999の範囲とするためi=2としている
            isPrimeNumbers[i] = true; // 4．②: 素数判定要素をすべてtrueに初期化する
        }

        // pが最大値の正の平方根を超えるまで④⑤の手順を繰り返す
        // 4.③: 素数として2をpに設定する。
        // 4.⑤: 素数判定配列pの次の素数を先頭から探索し、pへ設定する(p++)
        for(int p = 2; p <= Math.sqrt(max); p++){
            if (isPrimeNumbers[p]){ // pが素数であれば倍数をfalseに設定する
                for(int m = p*2; m <= max; m += p){
                    isPrimeNumbers[m] = false; // 4．④: 素数pの倍数をすべてfalseに設定する
                }
            }
        }
    }

    // 指定された範囲の素数を素数判定配列から抜き出し、結果を配列で返す
    int[] getPart(int min, int max){
        int count = 0;
        for(int n = min; n <= max; n++){ // 素数の数をカウントし、countへ格納
            if(isPrimeNumbers[n]){
                count++;
            }
        }

        int[] part = new int[count];
        int index = 0;
        for(int n = min; n <= max; n++){
            if(isPrimeNumbers[n]){
                part[index++] = n;
            }
        }
        return part;
    }
}