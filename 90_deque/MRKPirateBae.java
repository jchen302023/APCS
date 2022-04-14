// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW90: Swabbing the Deque
// 2022-04-12t
// time spent: 0.5  hr

public class MRKPirateBae {
  public static void main(String[] args){
    
    OurDeque<String> rodent = new OurDeque<String>();
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