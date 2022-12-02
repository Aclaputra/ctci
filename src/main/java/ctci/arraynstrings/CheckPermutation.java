package ctci.arraynstrings;

/*
 * traveloka question array and strings
 * if there is "ap" in "lengkap" then send true
 * input : "lengkap", "ap"
 *
 */
public class CheckPermutation {

  public static String sort(String s) {
    char[] content = s.toCharArray();
    java.util.Arrays.sort(content);
    return new String(content);
  }
  
  public static boolean permutation(String s, String t) {
    if (s.length() != t.length()) {
      return false;
    }

    int[] letters = new int[128];// Asssumption
    char[] s_array = s.toCharArray();
    for (char c: s_array) { // count number of each char in s.
      //System.out.println(c);
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
    System.out.println(permutation("fis", "dog"));
    System.out.println(permutation("fish", "fish"));
    System.out.println(permutation("fiish", "fiish"));
    System.out.println(permutation("fish", "fish"));
  }
}
