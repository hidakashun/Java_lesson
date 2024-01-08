package test;

public class Q4_2 {

	public static void main(String[] args) {
		//  1から10までの数を使用して、各数字が偶数か奇数かを判定し、
		//偶数の場合は「偶数」と、奇数の場合は「奇数」と表示するプログラムを作成してください。

		for (int num = 1; num <= 10; num++) {
			if (num % 2 == 0) {
				System.out.println(num+"は偶数");
			}
			else {
				System.out.println(num+"は奇数");
			}

			System.out.println();

		}

	}

}
