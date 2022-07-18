import java.util.HashMap;
import java.util.Map;

public class FrequencyOfElements {
  public static void frequencyOfEachElementInArray(int[] arrayOfNumbers) {

    Map<Integer, Integer> map = new HashMap<>();

    for (int index = 0; index < arrayOfNumbers.length; index++) {
      if (map.containsKey(arrayOfNumbers[index])) {
        map.put(arrayOfNumbers[index], map.get(arrayOfNumbers[index]) + 1);
      } else {
        map.put(arrayOfNumbers[index], 1);
      }
    }

    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      System.out.println("Number : " + entry.getKey() + " frequency : " + entry.getValue());
    }
  }
}
