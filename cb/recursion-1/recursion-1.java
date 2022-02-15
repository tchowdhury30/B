

public class recursion1 {

/*
Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1.
Compute the result recursively (without loops).
*/
  public int factorial(int n) {
    if (n = 1) {
      return n;
    } else {
      n *= n-1;
      n--;
      factorial(n);
      return n;
    }

  }
  public static void main(String[] args) {
    System.out.println(factorial(1));
    System.out.println(factorial(2));
    System.out.println(factorial(3));
  }
}
