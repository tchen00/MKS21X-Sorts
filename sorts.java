public class sorts{

  public static void selectionsort(int [] ary) {
    // looping through the first time
    for (int i = 0; i < ary.length; i++) {
      // original keeps track of the value at the first index
      int original = ary[i];
      // criteria has two things, the minimum and the index of the min
      int[] criteria = new int[] {original, i};
      for (int j = i + 1; j < ary.length; j++) {
        // checks to see the the value at index j is smaller than that of the criteria right now
        if (ary[j] < criteria[0]) {
          criteria[0] = ary[j];
          criteria[1] = j;
        }
      }
      // replace + repeat once again 
      ary[i] = criteria[0];
      ary[criteria[1]] = original;
    }
  }


}
