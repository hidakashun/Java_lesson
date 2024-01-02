package test;

public class Q7 {

	public static void main(String[] args) {
		// 変数と条件分岐: 3つの整数変数を宣言し、最大の数を表示するプログラムを書いてください。
		
		int num1 = 9;
		int num2 = 9;
		int num3 = 8;
		
		if(num1 > num2 && num1 > num3) {
			System.out.println(num1);
		}
		else if (num2 > num1 && num2 > num3) {
			System.out.println(num2);
		}
		else {
			System.out.println(num3);
		}

	}

}
