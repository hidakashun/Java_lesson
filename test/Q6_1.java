package test;

import java.util.Scanner;

public class Q6_1 {

	public static void main(String[] args) {
		// 要素数15の文字列配列を作成し、ユーザーに15個の文字列を入力して配列に保存し、
		//その後、配列の中の最初と最後の文字列を表示するプログラムを作成してください。

		String[] word = new String[15];

		System.out.println("文字列を15個入力してください");

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i < word.length; i++) {

			System.out.print((i + 1) + "個目 : ");
			word[i] = scanner.next();
		}

		System.out.println(word[0]);
		System.out.println(word[14]);

		scanner.close();

	}

}
