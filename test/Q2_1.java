package test;

public class Q2_1 {

	public static void main(String[] args) {
		// 変数と繰り返し: 1から100までの整数の中で3の倍数だけを表示するプログラムを書いてください。
		
		for (int num = 1; num <= 100; num++) {
			
			if (num % 3 == 0) {
				System.out.println(num);
			}
		}
	}

}
