import Question10.ConcurrentMapUsage;
import Question10.HashMapUsage;
import Question10.LinkedHashMapUsage;
import Question10.TreeMapUsage;
import Question11.ArrayListUsage;
import Question11.ArrayUsage;
import Question11.LinkedListUsage;

import java.util.LinkedHashMap;

public class MainClass {
  public static void main(String[] args) {
      //Question 1
     System.out.println("Given number is Prime : " + PrimeNumber.findIfNumberIsPrime(1000005));
     //Question 2
     System.out.println("Number at the given index of Fibonacci Series is : " +
     FibonacciSeries.findNthElementFromSeries(30));
     //Question 3
     int[] arrayOfNumbers = {1,2,3,1,2};
     FindDuplicateElement.findDuplicateElementInArray(arrayOfNumbers);
     //Question 4
     int[] array = {1,2,3,1,2,2,3,3,4};
     FrequencyOfElements.frequencyOfEachElementInArray(array);
     //Question 5
     System.out.println(Palindrome.checkIfStringIsPalindrome("ankit"));
      //Question 6
     PalindromeWithMinimumChange.stringPalindromeWithMinimumChange("ankit");
     //Question 7
     int[] arrayForProduct = {10, 30, 50, 60, 20};
     if(MaxProductOf3Element.maxProduct(arrayForProduct) == -1) {
         System.out.println("Array element has less than 3 elements");
     } else {
         System.out.println("Maximum product is " + MaxProductOf3Element.maxProduct(arrayForProduct));
     }
     // Question 10
      HashMapUsage.useOfHashMap();
      LinkedHashMapUsage.useOfLinkedHashMap();
      TreeMapUsage.useOfTreeMap();
      ConcurrentMapUsage.useOfConcurrentMap();
      // Question 11
      ArrayUsage.useOfArray();
      ArrayListUsage.useOfArrayList();
      LinkedListUsage.useOfLinkedList();
  }
}
