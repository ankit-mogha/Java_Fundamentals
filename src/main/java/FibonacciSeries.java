public class FibonacciSeries {
  public static int findNthElementFromSeries(int index) {
    int previousNumber = 0;
    int currentNumber = 1;
    if (index <= 1) {
      return index;
    }
    for (int loopIndex = 1; loopIndex < index; loopIndex++) {
      int temp = previousNumber + currentNumber;
      previousNumber = currentNumber;
      currentNumber = temp;
    }
    return currentNumber;
  }
}
