package ctci.arraynstrings;

public class IsUniqueChars {
  static boolean validateUniqueChars(String str) {
    if (str.length() > 128) return false;

    boolean[] char_set = new boolean[128];
    for (int i = 0; i < str.length(); i++) {
      int val = str.charAt(i);
      if (char_set[val]) { // Already found this char in string
        return false;
      }
      char_set[val] = true;
    }
    return true;
  }

  public static void main(String[] args) {
    // false
    System.out.println(validateUniqueChars("nani"));
    // true
    System.out.println(validateUniqueChars("nice"));
  }
}
