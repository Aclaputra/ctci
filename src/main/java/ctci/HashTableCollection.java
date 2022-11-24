package ctci;

import java.util.Hashtable;
import java.util.Map;

public class HashTableCollection 
{
  public static void main(String args[]) 
  {
    Hashtable<Integer, String> ht = new Hashtable<Integer, String>();
    ht.put(101, " acla");
    ht.put(101, "Putra");
    ht.put(102, "Ravi");
    ht.put(103, "Rahul");
    System.out.println("----------------Hash  table------------------");
    for (Map.Entry m:ht.entrySet()) {
      System.out.println(m.getKey()+" "+m.getValue());
    }
  }
}
