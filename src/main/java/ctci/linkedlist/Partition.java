package ctci.linkedlist;

import java.util.LinkedList;

public class Partition {

  static LinkedList<Integer> partition(LinkedList<Integer> node, int x) {
    LinkedList<Integer> beforeStart = null;
    LinkedList<Integer> beforeEnd = null;
    LinkedList<Integer> afterStart = null;
    LinkedList<Integer> afterEnd = null;

    /* Partition list */
    while (node != null) {
      LinkedList<Integer> next = node.next;
      node.next = null;
      if (node.data < x) {

      }
    }


    return beforeStart;
  }

  public static void main(String[] args) {
    LinkedList<Integer> list = new LinkedList<Integer>();
    list.add(1); list.add(2); list.add(3);
    list.add(4); list.add(4); list.add(5);
    list.add(6); list.add(3); list.add(5);

    for (int l : list) {
      System.out.print(" "+list.get(l));
    }
  }
}
