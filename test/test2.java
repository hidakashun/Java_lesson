package test;

public class test2 {

	public static void main(String[] args) {
		// 1〜10までに偶数が何個あるか、また偶数の合計は幾つになるか表示させる
		
		//個数、初期値0を代入
		int count = 0;
		
		//合計、初期値0を代入
		int sum = 0;
		
		//1〜10までを出力
		for (int num = 1; num <=10; num++) {
			//偶数を選別
			if (num % 2 == 0) {
				
				//繰り返し文の数だけカウントが増える
				count ++ ;
				//選別された数だけ加算される
				sum += num ;
			}
		}
		
		System.out.println("1〜10までに偶数は"+count+"個");
		System.out.println("偶数の合計は"+sum);
	}

}
