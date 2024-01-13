package test;

import java.util.Scanner;

public class Q8_1 {

	public static void main(String[] args) {
		// 要素数12の整数配列を作成し、ユーザーに12個の整数を入力して配列に保存し、
		///その後、偶数の数と奇数の数を表示するプログラムを作成してください。

		Scanner scanner = new Scanner(System.in);

		int[] num = new int[12];

		int A = 0;//偶数
		int B = 0;//奇数

		System.out.println("整数を入力してください");

		for (int i = 0; i < num.length; i++) {

			System.out.print((i + 1) + "個目 : ");

			num[i] = scanner.nextInt();

			if (num[i] % 2 == 0) {
				A++;
			}
			else {
				B++;
			}
		}

		System.out.println("入力された整数に偶数は" + A + "個あります");
		System.out.println("入力された整数に奇数は" + B + "個あります");

		scanner.close();

	}

}