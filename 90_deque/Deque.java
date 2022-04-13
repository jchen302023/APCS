// Team BrainForked (Gloria Lee, Jack Chen, John Gupta-She)
// APCS pd8
// HW90: Swabbing the Deque
// 2022-04-12t
// time spent: 0.5  hr

public interface Deque<KIWI> {
  
  public KIWI peekFirst();
  public KIWI peekLast();
  public void addFirst(KIWI x);
  public void addLast(KIWI x); 
  public KIWI removeFirst();
  public KIWI removeLast();
  public boolean isEmpty();
  public boolean removeFirstOccurrence(KIWI x);
  public boolean removeLastOccurrence(KIWI x);
}

