package Z;

public class quiz {

  public static void method1(int n, int m) {
    n += m;
    method2(3);
  }

  public static int method2(int n) {
    if (n > 0) {
      return 1;
    } else if (n == 0) {
      return 0;
    } else if (n < 0) {
      return -1;
    }
    return n;
  }
}
