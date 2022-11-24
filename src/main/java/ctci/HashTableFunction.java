package ctci;

import java.util.Arrays;

/**
 * Hash Functions = Speed
 **/
public class HashTableFunction {

  String[] theArray;
  int arraySize;
  int itemsInArray = 0;

  public static void main(String[] agrs) {

    HashTableFunction theFunc = new HashTableFunction(30);
    String[] elementsToAdd = { "1", "5", "17", "21", "26" };

    theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
  }

  public void hashFunction1(String[] stringsForArray, String[] theArray) {
    for (int n = 0; n < stringsForArray.length; n++) {

      String newElementVal = stringsForArray[n];
      theArray[Integer.parseInt(newElementVal)] = newElementVal;
    }
  }

  HashTableFunction(int size) {

    arraySize = size;
    theArray = new String[size];
    Arrays.fill(theArray, "-1");

  }
}
