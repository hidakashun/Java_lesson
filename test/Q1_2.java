package test;

import java.util.Scanner;

public class Q1_2 {

	public static void main(String[] args) {
		// 条件分岐: ユーザーから整数を入力として受け取り、
		//その数が偶数か奇数かを判断して表示するプログラムを作成してください。
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("整数を入力してください");
		
		int num = scanner.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("偶数");
		}
		else {
			System.out.println("奇数");
		}

		scanner.close();
		
	}

}
