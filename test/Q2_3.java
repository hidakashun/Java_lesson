package test;

public class Q2_3 {

	public static void main(String[] args) {
		// 配列と条件分岐: 整数の配列を作成し、その中の最小値を見つけるプログラムを書いてください。
		
		int[] num = {1,2,3,4,5,6,7,8,9};
		
		int min = num[0];
		
		for (int i = 0; i < num.length; i++) {
			
			if (num[i] < min) {
				min = num[i];
				
			}
		}
		
		System.out.println(min);

	}

}
