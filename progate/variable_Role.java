class variable_Role {
  public static void main(String[] args) {
    int length = 6;
    int height = 8;
    
    // 変数rectangleAreaに、四角形の面積を代入してください
    int rectangleArea = length * height;
    
    // 変数rectangleAreaを出力してください
    System.out.println(rectangleArea);
    
    // 変数triangleAreaに、三角形の面積を代入してください
    int triangleArea = length * height / 2;
    
    // 変数triangleAreaを出力してください
    System.out.println(triangleArea);
    
  }
}

//～なぜ変数を使うのか～
//何のデータかわかりやすい
//同じデータを繰り返し使える→重複する箇所が多い場合は、右の図のように変数にしておくと便利
//変更に対応しやすい


//～好ましい変数の書き方～
//良い例
//date … ◎英単語を用いる
//userName … ◎2語以上の場合は大文字で区切る(キャラメルケース)

//悪い例
//✕→エラーが出る　△→望ましくない
//1name … ✕数字開始
//first_name … △アンダーバー(スネークケース)
//namae … △ローマ字
//名前 … △日本語


//変数名を決めるときにまず大事なのは、何のデータをいれる変数なのかわかりやすい変数名をつけることです。
//何の値が入っている変数かわかりにくい名前は、コードが読みにくくなり、ミスを生む原因となります。
//わかりやすい変数名をつけるよう心がけましょう。