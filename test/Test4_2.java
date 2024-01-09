package test;

public class Test4_2 {

	public static void main(String[] args) {
		// 要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
		//[0]~[10]の値の奇数のみカンマ区切りで、[11]~[19]の値は偶数をカンマ区切りで表示させる問題
		//（最後の数にはカンマをつけない)

		int[] array = new int[20];

		for (int i = 0; i < array.length; i++) {
			array[i] = i * 5;
		}

		System.out.print("奇数 : ");

		for (int i = 0; i <= 10; i++) {
			if (array[i] % 2 != 0) {
				System.out.print(array[i]);

	            // 最後の数にはカンマを付けない
	            if (i <= 10 - 2) {
	                System.out.print(", ");
	            }

			}
		}

		System.out.println();//改行

		System.out.print("偶数 : ");

		for (int i = 11; i <= 19; i++) {
			if (array[i] % 2 == 0) {
				System.out.print(array[i]);

				// 最後の数にはカンマを付けない
	            if (i <= 19 - 2) {
	                System.out.print(", ");
	            }

			}
		}

		System.out.println();//改行
	}

}