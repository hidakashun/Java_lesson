package test;

import java.util.Scanner;

public class Q3_1 {

	public static void main(String[] args) {
		// 変数と条件分岐: ユーザーから年齢を入力として受け取り、
		//18歳以上であれば「成人」と表示し、そうでなければ「未成年」と表示するプログラムを書いてください。
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("年齢を入力してください");
		
		int age = scanner.nextInt();
		
		if (age >= 18) {
			System.out.println("成人");
		}
		else {
			System.out.println("未成年");
		}
		
		scanner.close();
		
	}

}
