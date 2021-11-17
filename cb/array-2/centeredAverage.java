/* Return the "centered" average of an array of ints, which we'll say is the mean
average of the values, except ignoring the largest and smallest values in the
array. If there are multiple copies of the smallest value, ignore just one copy,
and likewise for the largest value. Use int division to produce the final
average. You may assume that the array is length 3 or more.

centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3 */

public class centeredAverage {
  public static int centeredAverage(int[] nums) {
  int alength = nums.length;
  int largest = nums[0];
  int smallest = nums[0];
  int largestcopycounter = 0;
  int smallestcopycounter = 0;
  int total = 0;
  for (int i = 0; i < alength; i++) {
    largest = Math.max(largest, nums[i]);
  }
  for (int i = 0; i < alength; i++) {
    smallest = Math.min(smallest, nums[i]);
  }
  for (int i = 0; i < alength; i++) {
    if (nums[i] == largest && largestcopycounter < 1) {
      largestcopycounter += 1;
    }
    if (nums[i] == smallest && smallestcopycounter < 1) {
      smallestcopycounter += 1;
    }
  }
  for (int i = 0; i < alength; i++) {
    total += nums[i];
  }
  if (largestcopycounter > 0 || smallestcopycounter > 0) {
    total = total - largest * largestcopycounter - smallest * smallestcopycounter;
  }
  int average = total / (alength - largestcopycounter - smallestcopycounter);
  return average;
} // end method

  public static void main(String[] args) {
    System.out.println(centeredAverage(new int[] {1, 2, 3, 4, 100}));
    System.out.println(centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));
    System.out.println(centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
  } // end main

} // end class
