package d52;

// 実行用クラス
public class Q16Ensyu {
    static void main(String[] args) {
        Animal animal = new Animal(); // Animalクラスから動物を作る
        Animal tama = new Cat(); // CatはAnimalを引き継いでいるので、Animal型で使える
        Horse ao = new Horse(); // Horseクラスから馬を作る

        animal.bark(); // 「動物」と表示
        tama.bark(); // Catのbark()が呼ばれて「にゃーん」と表示
        ao.bark(); // Horseのbark()が呼ばれて「ひひーん」と表示
        ao.hello(); // Animalから受け継いだhello()も使える
    }
}

class Animal { // 親クラス（もとになるクラス）
    public void bark() {
        System.out.println("動物");
    }

    public void hello() {
        System.out.println("hello from Animal");
    }
}

class Cat extends Animal { // Animalを引き継いだ子クラス
    public void bark() { // 親のbark()を書き換える（オーバーライド）
        System.out.println("にゃーん");
    }
}

class Horse extends Animal { // Animalを引き継いだ子クラス
    public void bark() { // 馬用にbark()を書き換える
        System.out.println("ひひーん");
    }
}