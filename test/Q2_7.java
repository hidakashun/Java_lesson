package test;

public class Q2_7 {

	public static void main(String[] args) {
		// 繰り返し文と配列: 文字列の配列を作成し、
		//その中に含まれる文字列の長さが5文字未満のものだけを表示するプログラムを作成してください。
		
		String[] word = {"サクランボ","みかん","もも","パイナップル","カキ"};

		for (String a :word) {
			if (a.length() < 5) {
				System.out.println(a);
			}
		}
	}

}
