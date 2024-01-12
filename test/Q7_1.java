package test;

public class Q7_1 {

	public static void main(String[] args) {
		//  1から50までの数の中で3と5の公倍数だけをカンマ区切りで表示するプログラムを作成してください。
		
		for (int i = 1; i <= 50; i++) {
			if (i % 3 == 0 && i % 5 == 0) {
				System.out.println(i);
			}
		}

	}

}
