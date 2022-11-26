package ctci.linkedlist;

import java.util.HashSet;
import java.util.LinkedList;

public class RemoveDups {

  static void deleteDups(LinkedList<Integer> n) {
    HashSet<Integer> set = new HashSet<Integer>();
    LinkedList<Integer> previous = new LinkedList<>();
    int i = 0;
    while(n.getLast() != null && i < n.size())
    {
      int elem = (int) n.get(i);
      if (! set.contains(elem)) {
        set.add((Integer) n.get(i));
        previous.add(n.get(i));
      }
      i++;
    }
    System.out.print("\n After function call ");
    for (int j = 0; j < previous.size(); j++) {
      System.out.print(" "+ previous.get(j));
    }
  }

  public static void main(String $[]) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1); list.add(2); list.add(3);
    list.add(4); list.add(4); list.add(5);
    list.add(6); list.add(3); list.add(5);

    for (int l : list) {
      System.out.print(" "+list.get(l));
    }
    deleteDups(list);
  }
}
