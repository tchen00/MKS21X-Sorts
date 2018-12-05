public class Sorts{

  public static void selectionsort(int [] ary) {
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


}
