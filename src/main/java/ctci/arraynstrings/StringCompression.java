package ctci.arraynstrings;

public class StringCompression {
  static String compressBad(String str) {
    String compressedString = "";
    int countConsecutive = 0;
    for (int i = 0; i < str.length(); i++) {
        countConsecutive = 0;

        if (i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
          compressedString += "" + str.charAt(i) + countConsecutive;
          countConsecutive = 0;
        }
    }
    return compressedString.length() < str.length() ? compressedString : str;
  }

  public static void main(String $[]) {
    System.out.println(compressBad("aabcccccaaa"));
  }
}
