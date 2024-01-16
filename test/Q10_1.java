package test;

import java.util.Scanner;

public class Q10_1 {

	public static void main(String[] args) {
		// 要素数8の整数配列を宣言し、ユーザーに8個の整数を入力して配列に保存し、
		//その後、配列の中の数をすべて2倍にして表示するプログラムを作成してください。

		Scanner scanner = new Scanner(System.in);


		int[] num = new int[8];

		int a = 0;

		System.out.println("整数を8回入力してください。");

		for (int i = 0; i < 8; i++) {

			System.out.print((i + 1) + "回目 : ");

			num[i] = scanner.nextInt();
		}

		System.out.println("入力された整数を２倍にして表示します。");

		for (int i = 0; i < 8; i++) {
			a = num[i] *= 2;
			System.out.println((i + 1) + "回目" + a);
		}

		scanner.close();
	}

}