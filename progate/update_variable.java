class update_variable {
  public static void main(String[] args) {
    int number = 11;
    String text = "Ruby";
    System.out.println(number);
    System.out.println(text);
    
    // 変数numberを9で上書きしてください
    number = 9;
    
    // 変数numberを出力してください
    System.out.println(number);
    
    // 変数textを「Java」で上書きしてください
    text = "Java";
    
    // 変数textを出力してください
    System.out.println(text);
    
  }
}
//変数の更新
//一度値を代入した変数に、その後再び値を代入すると、後で代入した値によって変数の中身が上書きされます。
//更新時はデータ型をつけないこと!!