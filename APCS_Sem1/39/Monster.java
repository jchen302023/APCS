public class Monster {
  private int damage;

  public boolean isAlive () {
    return true;
  }
  public int attack(Protagonist pat) {
    damage = (int) Math.random() * 10;
    return damage;
  }
}
