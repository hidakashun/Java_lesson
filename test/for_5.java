package test;

import java.util.Scanner;

public class for_5 {
	
    public static void main(String[] args) {
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // 繰り返し回数の入力をユーザーから受け取る
        System.out.print("繰り返し回数を入力してください: ");
        int repeatCount = scanner.nextInt();

        // "Hello, World!"を指定された回数だけ表示する
        for (int i = 0; i < repeatCount; i++) {
            System.out.println("Hello, World!");
        }

        // Scannerオブジェクトのクローズ
        scanner.close();
    }
}