package test;

public class Car {
 // フィールドの定義
 private String brand;
 private String model;
 private int year;

 // コンストラクタの定義
 public Car(String brand, String model, int year) {
     this.brand = brand;
     this.model = model;
     this.year = year;
 }

 // displayInfoメソッドの定義
 public void displayInfo() {
     System.out.println("車のブランド: " + brand);
     System.out.println("車のモデル: " + model);
     System.out.println("製造年: " + year);
 }

 // mainメソッド
 public static void main(String[] args) {
     // Carクラスのオブジェクトを作成し、情報を表示
     Car myCar = new Car("Toyota", "Camry", 2020);
     myCar.displayInfo();
 }
}