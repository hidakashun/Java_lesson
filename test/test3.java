package test;

public class test3 {

	public static void main(String[] args) {
		// 1〜10までの整数をカンマ区切りで横並びで表示させる
		
		// 1〜10までの整数を処理
		for (int num = 1; num <= 10; num++) {
			
			
			if (num < 10) {  // 10以外の数字の後ろにカンマを追加
                System.out.print(num + ", ");  // カンマとスペースを付けて表示
            } else {
                System.out.print(num);  // 10の場合はカンマなしで表示
            }
			
		}
		
	}

}