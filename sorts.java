public class sorts{

  public static void main(String[] args){

  }
  
  public static void selectionsort(int [] ary) {
    for (int i = 0; i < ary.length; i++) {
      int original = ary[i];
      int[] criteria = [original, i];
      for (int j = 0; j < ary.length; j++) {
        if (ary[j] < criteria[0]) {
          criteria[0] = ary[j];
          criteria[1] = j;
        }
      }
      ary[i] = criteria[0];
      ary[criteria[1]] = original;
    }
  }



}
