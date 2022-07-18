package Question10;

import java.util.TreeMap;

public class TreeMapUsage {
  public static void useOfTreeMap() {
    TreeMap<String, Integer> treeMap = new TreeMap<>();
    treeMap.put("Java", 8);
    treeMap.put("JavaScript", 1);
    treeMap.put("Python", 3);
    System.out.println("TreeMap: " + treeMap);
  }
}
