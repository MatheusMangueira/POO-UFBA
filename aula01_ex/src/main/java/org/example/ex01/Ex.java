package org.example.ex01;

public class Ex {

  // complexidade de tempo: O(1)
  // complexidade de espaço: O(1)
  public static boolean ex01(int number) {
    return number % 2 == 0;
  }

  // complexidade de tempo: O(n)
  // complexidade de espaço: O(n)
  public static boolean ex02(int n) {
    String number = String.valueOf(n);

    for (int i = 0; i < number.length() - 1; i++) {
      if (number.charAt(i) == number.charAt(i + 1)) {
        return true;
      }
    }
    return false;
  }

  // complexidade de tempo: O(1)
  // complexidade de espaço: O(n)
  public static boolean ex03(int n) {
    String number = String.valueOf(n);

    if (number.length() == 1) {
      return false;
    }
    return number.charAt(0) == number.charAt(number.length() - 1);
  }

  // complexidade de tempo: O(n)
  // complexidade de espaço: O(1)
  public static void ex04(int n, int i, int j) {
    int count = 0;

    for (int index = 0; count < n; index++) {
      if (index % i == 0 || index % j == 0) {
        System.out.println(index + " ");
        count++;
      }
    }
  }

  // complexidade de tempo: O(n * m)
  // complexidade de espaço: O(n)
  public static String ex06(int n, int[] array) {
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < n; i++) {
      int factorial = 1;
      for (int j = 1; j <= array[i]; j++) {
        factorial *= j;
      }
      result.append(factorial);
      if (i < n - 1) {
        result.append(", ");
      }
    }

    return result.toString();
  }

}
