// ユーザーからの入力を使用した配列の操作

//Scanner クラスをインポートしています。これにより、コード内で Scanner クラスを使用することができます。
import java.util.Scanner;

public class lesson7_3 {
    public static void main(String[] args) {
      
        //Scanner クラスの新しいインスタンスを作成し、標準入力 (System.in) からの入力を読み取るためのオブジェクトを scanner 変数に格納しています。
        Scanner scanner = new Scanner(System.in);

        // 要素数10の整数型の配列を宣言
        int[] array = new int[10];

        // ユーザーからの入力で配列の要素を設定
        for (int i = 0; i < array.length; i++) {
            System.out.print("整数を入力してください: ");
            array[i] = scanner.nextInt();
        }

        // 入力された配列の内容を表示
        System.out.println("入力された配列の内容:");
        for (int value : array) {
            System.out.println(value);
        }

        scanner.close();
    }
}