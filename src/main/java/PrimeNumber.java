public class PrimeNumber {
  public static boolean findIfNumberIsPrime(int number) {
    int counter = 0;
    if (number == 0 || number == 1) {
      return false;
    } else {
      for (int index = 2; index <= number; index++) {
        if (number % index == 0) {
          counter++;
        }
      }
    }
    if (counter == 1) {
      return true;
    } else {
      return false;
    }
  }
}
