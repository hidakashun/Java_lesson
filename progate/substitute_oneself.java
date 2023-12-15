class substitute_oneself {
  public static void main(String[] args) {
    int number = 3;
    System.out.println(number);
    
    // 変数numberの値に7を足して、変数numberを上書きしてください
    number = number + 7;
    
    // 変数numberを出力してください
    System.out.println(number);
      
  }
}

//自己代入
//変数numberに3が入っているとき、numberの値に7を足して10に上書きしたい場合はどうすればよいでしょうか。
//この場合は、すでに定義している変数numberに7を足して、また変数numberに代入します。
//number = number + 7;
//不思議な式に見えますが、プログラミングでは「=」は代入なので問題はありません。よく使うので覚えておきましょう。