public class Main {
    public static void main(String[] args) { //System.out.println();
        //勇者の生成
        Hero h = new Hero();
        //Heroに初期値をセット
        h.name = "ユウト";
        h.hp = 100;

        Matango m1 = new Matango();
        m1.hp=50;
        m1.suffix='A';

        Matango m2 = new Matango();
        m2.hp=48;
        m2.suffix='B';

        h.slip();
        m1.run();
        m2.run();
        h.sit(10);
        h.run();
    }
}