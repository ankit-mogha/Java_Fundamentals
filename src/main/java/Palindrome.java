public class Palindrome {
  public static boolean checkIfStringIsPalindrome(String str) {
    StringBuilder revStr = new StringBuilder();
    for (int index = str.length() - 1; index >= 0; index--) {
      revStr.append(str.charAt(index));
    }
    return revStr.toString().equals(str);
  }
}
