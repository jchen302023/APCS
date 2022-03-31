import java.util.ArrayList;

public class ALStack<PANCAKE> implements Stack<PANCAKE> {
  
  private ArrayList<PANCAKE> you;

  public ALStack(){
    you = new ArrayList<PANCAKE>();
  }

  public boolean isEmpty(){
    return (you.size() == 0);
  }

  public PANCAKE peekTop(){
    return you.get(you.size() - 1);
  }

  public PANCAKE pop(){
    PANCAKE out = peekTop();
    you.remove(you.size()-1);
    return out;
  }

  public void push(PANCAKE bob){
    you.add(bob);
  }
}