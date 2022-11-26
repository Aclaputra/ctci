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

    /**
     *  type String[]
     *  hasFunction1(stringForArray, theArray)
     **/
    theFunc.hashFunction1(elementsToAdd, theFunc.theArray);
    theFunc.displayTheStack();
  }

  // put value based the corresponding key
  public void hashFunction1(String[] stringsForArray, String[] theArray) {

    for (int n = 0; n < stringsForArray.length; n++) {
      String newElementVal = stringsForArray[n];
      theArray[Integer.parseInt(newElementVal)] = newElementVal;
    }
  }

  public void hashFunction2(String[] stringsForArray, String[] theArray) {

  }

  // Constructor with 1 paratemer called size
  HashTableFunction(int size) {

    arraySize = size;
    theArray = new String[size];
    Arrays.fill(theArray, "-1");

  }

  public void displayTheStack() {
    int increment = 0;

    for (int m = 0; m < 3; m++) {
      increment += 10;
      for(int n = 0; n < 71; n++) 
        System.out.print("-");

      System.out.println();

      for(int n = increment - 10; n < increment; n++) 
        System.out.format("| %3s "+" ", n);

      System.out.println("|");

      for (int n = 0; n < 71; n++) 
        System.out.print("-");

      System.out.println();

      for (int n = increment - 10; n < increment; n++) 
        if (theArray[n].equals("-1"))
          System.out.print("|      ");
        else
          System.out
            .print(String.format("| %3s "+" ", theArray[n]));

      System.out.println("|");

      for (int n = 0; n < 71; n++) 
        System.out.print("-");

      System.out.println();
    }
  }
}
