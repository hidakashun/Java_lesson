package test;

public class test4 {

    public static void main(String[] args) {
        //要素数20の配列を宣言し、要素に0から5ずつ加算して代入させる。
        //[0]~[10]の値の奇数のみカンマ区切りで、
        //[11]~[19]の値は偶数をカンマ区切りで表示させる

        // 要素数が20の整数型の配列を宣言
        int[] array = new int[20];

        // 配列の各要素に0から5ずつ加算して代入
        for (int i = 0, value = 0; i < array.length; i++, value += 5) {
            array[i] = value;
        }

        // [0]~[10]までの奇数の値をカンマ区切りで表示
        System.out.print("奇数: ");
        for (int i = 0; i <= 10; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();  // 改行

        // [11]~[19]までの偶数の値をカンマ区切りで表示
        System.out.print("偶数: ");
        for (int i = 11; i <= 19; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + ",");
            }
        }
        System.out.println();  // 改行
    }
}