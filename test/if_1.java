package test;

public class if_1 {

	public static void main(String[] args) {
		// 整数変数 num を宣言し、それぞれに任意の整数を代入して、
		//正の整数かどうかを判定するプログラムを書いてください。
		
		int num = -9;
		
		if ( num > 0) {
			System.out.println("正の整数");
		}
		else if (num == 0) {
			System.out.println("正の整数でも負の整数でもありません");
		}
		else {
			System.out.println("負の整数です");
		}
	}

}
