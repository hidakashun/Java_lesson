package test;

public class array_1 {

	public static void main(String[] args) {
		// 5つの整数を配列に格納し、その中の最小値を求めるプログラムを書いてください。

		int[] num = {56, 23, 91, 12, 34};

        // 最小値を初期化（配列の最初の要素で）
        int min = num[0];

        // 配列内の最小値を求める
        for (int i = 1; i < num.length; i++) {
            if (num[i] < min) {
                min = num[i];
            }
        }

        // 最小値を表示
        System.out.println("配列の中の最小値は: " + min);
    }
}