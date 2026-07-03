package d51;

public class Q24 {
    public static void main(String[] args) {
        for (int x = 1; x < 20; x ++){
            if (x % 3 == 0 || x % 5 == 0){
                System.out.println(x + ",");
            }
        }
    }
}
/*
実際の試験ではこのように書いていくと解きやすいかも
3, 5, 6, 9 ,10, 12, 15, 18,
[演習]
変数や倍数を変更したりして遊んでみましょう。また、「公倍数」も試してみましょう
 */
