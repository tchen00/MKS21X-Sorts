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
      boolean swap = false;
      for (int i = 0; i < data.length - 1; i++) {
        if (data[i] > data[i+1]){
          int old = data[i];
          data[i] = data[i+1];
          data[i+1] = old;
          swap = true;
        }
      }

    }

}
