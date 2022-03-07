/*
<Frist> <Lsat>
APCS
HW<nn> -- <Title/Topic/Summary... (Aim for concision, brevity, CLARITY. Write to your future self...)>
<yyyy>-<mm>-<dd>
time spent: <elapsed time in hours, rounded to nearest tenth>
*/

public class Mysterion {
  public void mysterion(int[] arr, int a, int b, int c) {
    int v = arr[c];
    int c2 = arr[c];
    arr[c]=arr[b];
    // swap c and b;
    int s = a;
    for (int i = 0; i < b; i ++) {
      if (arr[i] < v) {
        // swap s and i
        s += 1;
      }
    }
    // swap b and s
  } // mysterion

  public static void main(String[] args) {

  } // main
}
