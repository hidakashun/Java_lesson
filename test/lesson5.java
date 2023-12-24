package test;

public class lesson5 {

	public static void main(String[] args) {
		//  整数変数 score の値に基づき、90以上なら"A", 
		//80以上90未満なら"B", それ以外なら"C"と表示するプログラムを作成してください。
		int score = 90;
		
		if (score >= 90) {
			System.out.println("A");
		}	
		else if (score >= 80 && score < 90) {
			
			System.out.println("B");
		}
		else {
			System.out.println("C");
		}
	}

}
