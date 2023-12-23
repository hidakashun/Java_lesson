package test;

public class test2_2{
  
  public static void main(String[] args) {
    // 1〜20までに奇数が何個あるか、また奇数の合計は幾つになるか表示させる
    int count = 0;
    int sum = 0;
    
    for (int num = 1; num <= 20; num ++){
      
      if (num % 2 != 0){
        
        count ++;
        sum += num;
      }
    }
    System.out.println("1〜20までに奇数は"+count+"個");
    System.out.println("奇数の合計は"+sum);
  }
}