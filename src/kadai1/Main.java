package kadai1;

public class Main {
    public static void main(String[] args) {
        // 1. 勇者と魔法使いを生成
        Hero h = new Hero();
        h.name = "ミナト";
        Wizard w = new Wizard();
        w.name = "アサカ";

        // 2. お化けキノコを2匹生成
        Matango m1 = new Matango('A');
        Matango m2 = new Matango('B');

        // 3. それぞれ攻撃させる
        System.out.println("---勇者のターン---");
        h.attack(m1);
        h.run();

        System.out.println("\n---魔法使いのターン---");
        w.attack(m2);
        w.run();
    }
}
