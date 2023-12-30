package test;

public class if_3 {

	public static void main(String[] args) {
		// 整数変数 x y z を宣言し、それぞれに任意の整数を代入して、
		// 最大の数値を判定して表示するプログラムを書いてください。

		int x = 9;
		int y = 8;
		int z = 10;
		
		if ( x > y && x > z) {
			System.out.println(x);
		}
		else if ( y > x && y > z) {
			System.out.println(y);
		}
		else {
			System.out.println(z);
		}

	}

}
