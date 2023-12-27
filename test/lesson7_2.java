package test;

public class lesson7_2 {
    public static void main(String[] args) {
        //配列の要素に値を代入
        // 要素数が3の整数型の配列を宣言
        int[] values = new int[3];

        // 配列の各要素に値を代入
        values[0] = 100;
        values[1] = 200;
        values[2] = 300;

        // 配列の内容を表示
        for (int i = 0; i < values.length; i++) {
            System.out.println("values[" + i + "] = " + values[i]);
        }
    }
}