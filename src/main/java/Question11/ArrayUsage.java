package Question11;

import java.util.Arrays;

public class ArrayUsage {
  public static void useOfArray() {
    int[] array = new int[10];
    for (int index = 0; index < 10; index++) {
      array[index] = index;
    }
    System.out.println("Array : " + Arrays.toString(array));
  }
}
