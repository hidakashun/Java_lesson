class substitute_oneself2 {
  public static void main(String[] args) {
    int number = 8;
    
    // 変数numberに7をかけて、変数numberを上書きしてください
    number *= 7;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数numberの値に1を足して、変数numberを上書きしてください
    number ++;
    
    // 変数numberを出力してください
    System.out.println(number);
    
  }
}
//自己代入の省略

//自己代入には省略した書き方
//number = number + 5; → number += 5;
//number = number - 5; → number -= 5;
//number = number * 5; → number *= 5;
//number = number / 5; → number /= 5;
//number = number % 5; → number %= 5;

//変数に1を足す、もしくは1を引く場合の、さらなる省略系
//number = number + 1; → number ++;
//number = number - 1; → number --;