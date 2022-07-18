public class MainClass {
  public static void main(String[] args) {
     System.out.println("Given number is Prime : " + PrimeNumber.findIfNumberIsPrime(1000005));
     System.out.println("Number at the given index of Fibonacci Series is : " +
     FibonacciSeries.findNthElementFromSeries(30));
     int[] arrayOfNumbers = {1,2,3,1,2};
     FindDuplicateElement.findDuplicateElementInArray(arrayOfNumbers);
     int[] array = {1,2,3,1,2,2,3,3,4};
     FrequencyOfElements.frequencyOfEachElementInArray(array);
     System.out.println(Palindrome.checkIfStringIsPalindrome("ankit"));
  }
}
