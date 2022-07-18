package Question10;

import java.util.LinkedHashMap;

public class LinkedHashMapUsage {
  public static void useOfLinkedHashMap() {
    LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
    linkedHashMap.put("Java", 8);
    linkedHashMap.put("JavaScript", 1);
    linkedHashMap.put("Python", 3);
    System.out.println("LinkedHashMap: " + linkedHashMap);
  }
}
