

public class recursion1 {

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
Compute the result recursively (without loops).
*/
  public static int factorial(int n) {
    int ans = 1;
    if (n <= 1) {
      return ans;
    } else {
      int ansholder = n * (n-1);
      n = n -1;
      factorial(n);
      ans = ansholder * ans;
      return ansholder;
    }

  }
  public static void main(String[] args) {
    System.out.println(factorial(4));
    System.out.println(factorial(5));
    System.out.println(factorial(6));
  }
}
