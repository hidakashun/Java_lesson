package test;

public class for_4 {
    public static void main(String[] args) {
        // 1から9までの九九の表を表示
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d", i * j);  // 3桁のスペースを持つ形式で表示
            }
            System.out.println();  // 新しい行に移動
        }
    }
}