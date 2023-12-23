package test;

public class test1_2 {

	public static void main(String[] args) {
    // 10〜1までの数字のうち奇数のみを降順で表示させる
    
    //10〜1までの数を作成
    for (int num = 10; num >= 1; num--){
      
      //奇数であるかどうかを確認
      if (num % 2 != 0){
        
        System.out.println(num);
      }
    }
	}
}