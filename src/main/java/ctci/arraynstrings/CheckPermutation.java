package ctci.arraynstrings;

/*
 * traveloka question array and strings
 * if there is "ap" in "lengkap" then send true
 * input : "lengkap", "ap"
 *
 */
public class CheckPermutation {

  static String sort(String s) {
    char[] content = s.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
  
  static boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] letters = new int[128];// Asssumption
    char[] s_array = s.toCharArray();
    for (char c: s_array) { // count number of each char in s.
      letters[c]++;
    }

    for (int i = 0; i < t.length(); i++) {
      int c = (int) t.charAt(i);
      letters[c]--;
      if (letters[c] < 0) {
        return false;
      }
    }

    return true;
  }

  public static void main(String[] args) {
    System.out.println(sort("fish"));
    System.out.println(sort("fish "));
    System.out.println(permutation("fish ", "dog"));
    System.out.println(permutation("fish", "fish"));
  }
}
