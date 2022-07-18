import java.util.ArrayList;
import java.util.List;

public class SubStringOfKSize {
  public static List<String> subStringOfString(String str, int k) {
    List<String> subStrings = new ArrayList<>();
    for (int index = 0; index < str.length(); index++) {
      for (int index2 = index + 1; index2 <= str.length(); index2++) {
        if (str.substring(index, index2).length() == k) {
          subStrings.add(str.substring(index, index2));
        }
      }
    }
    return subStrings;
  }
}
