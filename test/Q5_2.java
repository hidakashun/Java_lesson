package test;

import java.util.Scanner;

public class Q5_2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number; // 入力された数値を保持する変数

        // ユーザーが0を入力するまで繰り返す
        do {
            System.out.println("数値を入力してください（0を入力すると終了します）");
            number = scanner.nextInt(); // 数値の入力

            if (number > 0) {
                System.out.println("正の数");
            } else if (number < 0) {
                System.out.println("負の数");
            } else {
                System.out.println("0が入力されました。プログラムを終了します。");
            }

        } while (number != 0); // 入力された数値が0でない場合は繰り返し

        scanner.close(); // スキャナーを閉じる
    }
}