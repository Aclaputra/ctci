package ctci.arraynstrings;

public class URLify {

  static void replaceSpaces(char[] str, int trueLength) {
    int spaceCount = 0, index, i = 0;
    for (i = 0; i < trueLength; i++) {
      if (str[i] == ' ') {
        spaceCount++;
      }
    }

    index = trueLength + spaceCount * 2;
    if (trueLength < str.length) {
      str[trueLength] = '\0'; // End array
    }

    for (i = trueLength - 1; i >= 0; i--) {
      if (str[i] == ' ') {
        str[index - 1] = '0';
        str[index - 2] = '2';
        str[index - 3] = '%';
        index = index - 3;
      } else {
        str[index - 1] = str[i];
        index--;
      }
    }

    System.out.println(str);
  }
  public static void main(String[] args) {
    String str = "Mr John Smith    ";
    char[] ch = new char[str.length()];
    for (int i =0; i < str.length(); i++) {
      ch[i] = str.charAt(i);
    }
    //for (char c : ch) {
    //  System.out.println(c);
    //}
    replaceSpaces(ch, 13);
  }
}
