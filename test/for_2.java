package test;

public class for_2 {

	public static void main(String[] args) {
		// 1から20までの偶数のみを表示するプログラムを書いてください。
		
		for (int num = 1; num <= 20; num++) {
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}

	}

}
