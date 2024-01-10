package test;

public class Q5_1 {

	public static void main(String[] args) {
		// 1から20までの整数を使用して、それらの数をすべて足し合わせた結果を表示するプログラムを作成してください。

		//足し合わせる変数を作成
		int sum = 0;

		//1から20までの整数を作成
		for(int i = 1; i <= 20; i++) {

			//繰り返し足す
			sum += i;

		}

		System.out.println(sum);

	}

}
