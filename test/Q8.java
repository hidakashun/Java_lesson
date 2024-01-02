package test;

public class Q8 {

	public static void main(String[] args) {
		// 繰り返し文と配列: 整数の配列を作成し、その中のすべての偶数を表示するプログラムを作成してください。
		
		int[] num = {1,2,3,4,5,6,7,8,9,};
		
		for (int a : num) {
			if (a % 2 == 0) {
				System.out.println(a);
			}
		}

	}

}
