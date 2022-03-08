public class Mysterion {
  public void mysterion(int[] arr, int a, int b, int c) {
    int v = arr[c];
    //swap arr[c], arr[b]
    int s = a;
    for (int i =a; i < b; i++) {
      if (arr[i] < v) {
        //swap
        s++;
      }
      //swap arr[b], arr[s]
    }
  }
}
