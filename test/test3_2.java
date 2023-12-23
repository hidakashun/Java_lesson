package test;

public class test3_2{
  
  public static void main(String[] args) {
    // 1〜20までの整数のうち奇数をカンマ区切りで横並びで表示させる
    for (int num = 1; num <= 20; num++){
      if (num % 2 != 0){
        if (num < 20){
          System.out.print(num+", ");
        }
        else{
          System.out.print(num);
        }
      }
    }
  }
}