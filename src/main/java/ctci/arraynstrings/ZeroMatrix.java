package ctci.arraynstrings;

public class ZeroMatrix {
  
  static void setZeros(int[][] matrix) {
    boolean[] row = new boolean[matrix.length];
    boolean[] column = new boolean[matrix[0].length];
    
    for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[0].length; j++) {
        if (matrix[i][j] == 0) {
          row[i] = true;
          column[j] = true;
        }
      }
    }

    // nullify row
    for (int i = 0; i < row.length; i++) {
      if (row[i]) nullifyRow(matrix, i);
    }

    // nullify columns
    for (int j = 0; j < column.length; j++) {
      if (column[j]) nullifyColumn(matrix, j);
    } 

    // check matrix input
    for(int[] c : matrix) {
      for(int d : c) {
        System.out.println(d);
      }
    }

    for (boolean r : row) {
      System.out.println(r);
    }

    for (boolean c : column) {
      System.out.println(c);
    }
  }

  static void nullifyRow(int[][] matrix, int row) {
    for (int j = 0; j < matrix[0].length; j++) {
      matrix[row][j] = 0;
    }
  }

  static void nullifyColumn(int[][] matrix, int col) {
    for (int i = 0; i < matrix.length; i++) {
      matrix[i][col] = 0;
    }
  }

  public static void main(String $[]) {
    int[][] arr = {{0, 2}, {3, 4}};
    setZeros(arr);
  }
}
