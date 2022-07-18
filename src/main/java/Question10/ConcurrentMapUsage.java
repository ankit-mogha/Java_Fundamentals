package Question10;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

public class ConcurrentMapUsage {
  public static void useOfConcurrentMap() {
    ConcurrentMap<String, Integer> concurrentMap = new ConcurrentHashMap<>();
    concurrentMap.put("Java", 8);
    concurrentMap.put("JavaScript", 1);
    concurrentMap.put("Python", 3);
    System.out.println("ConcurrentMap: " + concurrentMap);
  }
}
