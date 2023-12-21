package test;

public class test1 {

	public static void main(String[] args) {
		// 1〜10までの数字のうち偶数のみを昇順で表示させる
		
		//for文→繰り返し処理
		//変数numに1を代入
		//変数numが10になるまで1ずつ繰り返し加算される
		for (int num = 1; num <= 10; num++) {
			
			//変数numの整数を2で割り切れるかif文で判断
			//2で割り切れた場合表示される
			if (num % 2 == 0) {
				
				System.out.println(num);
			}
		}

	}

}