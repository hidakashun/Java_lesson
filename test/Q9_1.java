package test;

import java.util.Random;

public class Q9_1 {

    public static void main(String[] args) {
        // Randomクラスのインスタンスを作成
        Random random = new Random();

        // 指定した範囲内の整数乱数を生成（例: 1から14まで）
        int randomValue2 = random.nextInt(14) + 1;
        System.out.println(randomValue2);
    }
}