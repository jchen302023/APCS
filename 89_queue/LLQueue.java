// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW89: Queue Two Ways
// 2022-04-11m
// time spent: 0.5  hr
/*
  DISCO:
  * To avoid null pointer exception, we dont just instantiate new arrays/lists by stating the Object type and then the name.
  We also have to add that it is a new (Object)(); as well
  QCC:
  *  Which one is more efficient? Linked List because both enqueue and dequeue are O(1)
*/


import java.util.LinkedList;

public class LLQueue<KIWI>{
  LinkedList<KIWI> kiwi = new LinkedList<KIWI>();
  
  public KIWI dequeue(){
    if (isEmpty()) {
      return null;
    }
    KIWI old = kiwi.get(0);
    kiwi.remove(0);
    return old;
  }

  public void enqueue( KIWI x ) {
    kiwi.add(x);
  }

  public boolean isEmpty(){
    return kiwi.size() == 0;
  }
  public KIWI peekFront(){
    return kiwi.get(0);
  }
  
  public static void main(String[] args) {
    LLQueue<String> rodent = new LLQueue<String>();
    rodent.enqueue("mouse");
    
    rodent.enqueue("weasle");
    
    System.out.println(rodent.peekFront());
    System.out.println(rodent.dequeue());
    System.out.println(rodent.peekFront());
    System.out.println(rodent.dequeue());
    rodent.enqueue("rat");
    System.out.println(rodent.peekFront());
    System.out.println(rodent.dequeue());
    rodent.enqueue("hamster");
    System.out.println(rodent.peekFront());
    System.out.println(rodent.dequeue());
  }
  
}