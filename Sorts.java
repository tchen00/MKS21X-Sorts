import java.io.*;
import java.util.*;
public class Sorts{
  /**Selection sort of an int array.
  *Upon completion, the elements of the array will be in increasing order.
  *@param data  the elements to be sorted.
  */
  public static void selectionSort(int [] ary) {
    // looping through the first time
    for (int i = 0; i < ary.length; i++) {
      // original keeps track of the value at the first index
      int original = ary[i];
      // criteria has two things, the minimum and the index of the min
      int min = original;
      int indexKeeper = i;
      //int[] criteria = new int[] {original, i};
      for (int j = i + 1; j < ary.length; j++) {
        // checks to see the the value at index j is smaller than that of the criteria right now
        if (ary[j] < min) {
          min = ary[j];
          indexKeeper = j;
        }
      }
      // replace + repeat once again
      ary[i] = min;
      ary[indexKeeper] = original;
    }
  }
    /**Bubble sort of an int array.
      *Upon completion, the elements of the array will be in increasing order.
      *@param data  the elements to be sorted.
      */
    public static void bubbleSort(int[] data){
      //making j 1 less than data --> no errors returned (end is always the largest after each loop )
      for (int i = data.length -1; i > 0; i--) {
        //looping through array until i
        for (int j = 0; j < i; j++) {
          // check
          if (data[j] > data[j+1]) {
            //need a temp bc data[j+1] will be replaced
            int temp = data[j+1];
            data[j+1] = data[j];
            data[j] = temp;
          }
        }
      }
    }
  }
