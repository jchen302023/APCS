// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW90: Swabbing the Deque
// 2022-04-12t
// time spent: 0.5  hr

import java.util.LinkedList;

public class YourImplementationOfDeque<KIWI> implements Deque<KIWI> {
  
  LinkedList<KIWI> kiwi = new LinkedList<KIWI>();
  
  public KIWI peekFirst() {
    return kiwi.get(0); 
  }
  
  public KIWI peekLast() {
    return kiwi.get(kiwi.size()-1);
  }
  
  public void addFirst(KIWI x) {
    kiwi.add(0, x);
  }
  
  public void addLast(KIWI x) {
    kiwi.add(kiwi.size() - 1, x); 
  }
  public KIWI removeFirst() {
    KIWI jet = kiwi.get(0);
    kiwi.remove(0); 
    return jet; 
  }
  public KIWI removeLast(){
    KIWI ret = kiwi.get(kiwi.size()-1);
    kiwi.removeLast();
    return ret;
  }
  
  public boolean removeFirstOccurrence(KIWI x) {
    return kiwi.removeFirstOccurrence(x); 
  }
  public boolean removeLastOccurrence(KIWI x) {
    return kiwi.removeLastOccurrence(x);
  }
  
  public boolean isEmpty(){
    return kiwi.size()==0;
  }

  public static void main(String[] args){
    
    YourImplementationOfDeque<String> rodent = new YourImplementationOfDeque<String>();
    rodent.addFirst("mouse");
    rodent.addFirst("rat");
    rodent.addLast("weasle");
    rodent.addLast("weasle");
    rodent.addLast("rat");
    // rat mouse weasle weasle rat 
    
    System.out.println(rodent.peekLast());
    System.out.println(rodent.removeLast());
    System.out.println(rodent.peekFirst());
    System.out.println(rodent.removeFirst());
    rodent.removeLastOccurrence("rat");
    System.out.println(rodent.peekLast());
  }
  
}
