import java.util.LinkedList;

public class LLStack<PANCAKE> implements Stack<PANCAKE> {
  
  private LinkedList<PANCAKE> who;

  public LLStack(){
    who = new LinkedList<PANCAKE>();
  }

  public boolean isEmpty(){
    return (who.size() == 0);
  }

  public PANCAKE peekTop(){
    return who.getFirst();
  }

  public PANCAKE pop(){
    PANCAKE out = peekTop();
    who.removeFirst();
    return out;
  }

  public void push(PANCAKE bob){
    who.add(0,bob);
  }
}