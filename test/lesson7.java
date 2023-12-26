package test;

public class lesson7 {

    public static void main(String[] args) {
        // 要素数が5の整数型の配列を宣言して初期化
        int[] numbers = {10, 20, 30, 40, 50};

        // 配列の内容を表示
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("numbers[" + i + "] = " + numbers[i]);
        }
    }
}