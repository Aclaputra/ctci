import java.io.*;
import java.util.*;

public class CheckPermutation2 {
    static PrintStream out = System.out;
    static Scanner sc = new Scanner(System.in);
    static boolean permutation(String s, String t) {
      if (s.length() != t.length()) {
        return false;
      }

      int[] letters = new int[128];
      char[] s_array = s.toCharArray();
      for (char c: s_array) {
        letters[c]++;
      }

      for (int i=0; i<t.length(); i++) {
        int c = (int) t.charAt(i);
        letters[c]--;
        if (letters[c] < 0) {
          return false;
        }
      }
    }
    return true;
}


public static void main(String[] args) {
  out.println(permutation("fis", "dog"));
}
