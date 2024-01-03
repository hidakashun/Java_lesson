package test;

import java.util.Scanner;

public class Q2_6 {

	public static void main(String[] args) {
		// 変数と条件分岐: ユーザーに整数を2つ入力してもらい、
		//それらの値が等しいかどうかを確認するプログラムを書いてください。
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("一つ目の整数を入力して下さい");
		
		int num1 = scanner.nextInt();
		
		System.out.println("二つ目の整数を入力してください");
		
		int num2 = scanner.nextInt();
		
		if (num1 == num2) {
			System.out.println("それらの値は等しいです");
		}
		else {
			System.out.println("それらの値は等しくありません");
		}

		scanner.close();
		
	}

}
