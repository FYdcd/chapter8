package kadai1;

public class Hero extends Character{
    @Override
    public void attack(Matango m) {
        System.out.println(this.name+"の攻撃");
        System.out.println("敵に10のダメージを与えた");
        m.hp -= 10;
    }
}
