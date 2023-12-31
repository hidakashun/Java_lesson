import java.util.Scanner;

public class for_3 {
    public static void main(String[] args) {
      //ユーザーが"exit"と入力するまで、何度でもユーザーから文字列を受け取り、それを表示するプログラムを書いてください。

      
        // Scannerオブジェクトの作成
        Scanner scanner = new Scanner(System.in);

        // ユーザーからの入力を受け取る
        System.out.println("文字列を入力してください。'exit'と入力すると終了します。");

        // 繰り返し入力と表示
        while (true) {
            String input = scanner.nextLine();  // 文字列を受け取る

            // 入力が"exit"であればループを抜ける
            if (input.equalsIgnoreCase("exit")) {
                System.out.println("プログラムを終了します。");
                break;
            }

            // 入力された文字列を表示
            System.out.println("入力された文字列: " + input);
        }

        // Scannerオブジェクトのクローズ
        scanner.close();
    }
}