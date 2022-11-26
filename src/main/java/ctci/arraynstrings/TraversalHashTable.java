package ctci;

import java.util.Hashtable;
import java.util.Map;

public class TraversalHashTable {
  public static void main(String[] args) {
    // Create an instance of HashTable
    Hashtable<String, Integer> ht = new Hashtable<>();

    // Adding elements using put method
    ht.put("acla", 10);
    ht.put("putra", 30);
    ht.put("noctis", 20);

    // Iterating using enchanced for loop
    for (Map.Entry<String, Integer> e : ht.entrySet())
      System.out.println(e.getKey() + " " + e.getValue());
  }
}
