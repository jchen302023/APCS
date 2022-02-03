public class Protagonist {

    private String name;
    private int damage;

    public Protagonist (String s) {
      s = name;
    }
    public int attack( Monster smaug) {
      damage = (int) Math.random() * 100;
      return damage;
    }
    public boolean isAlive () {

      return true;

    }
    public String specialize() {
      return "hi";
    }
    public String normalize() {
      return "hello";
    }
    public String getName () {
      return name;
    }
}
