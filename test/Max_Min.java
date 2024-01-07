package test;

import java.util.Scanner;

public class Max_min {

    public static void main(String[] args) {
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // 10個の整数を格納する配列を宣言
        int[] numbers = new int[10];

        // ユーザーから10個の整数を入力して配列に保存
        for (int i = 0; i < 10; i++) {
            System.out.print("整数を入力してください（" + (i + 1) + "/10）: ");
            numbers[i] = scanner.nextInt();
        }

        // 配列の中の最大値と最小値を初期化
        int max = numbers[0];
        int min = numbers[0];

        // 配列を走査して最大値と最小値を見つける
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        // 最大値と最小値を表示
        System.out.println("配列の中の最大値: " + max);
        System.out.println("配列の中の最小値: " + min);

        // Scannerオブジェクトのクローズ
        scanner.close();
    }
}