package Finals.done;

public class testingArrays {

  public static void main(String[] args) {
    int[][] bingoCard = { { 20, 15, 7 }, { 8, 7, 19 }, { 7, 13, 47 } };

    int[][] bingoCard2 = new int[3][3];
    bingoCard2[0][0] = 20;
    bingoCard2[0][1] = 15;
    bingoCard2[0][2] = 7;
    bingoCard2[1][0] = 8;
    bingoCard2[1][1] = 7;
    bingoCard2[1][2] = 19;
    bingoCard2[2][0] = 7;
    bingoCard2[2][1] = 13;
    bingoCard2[2][2] = 47;

    //[row][column] 2 Dimensional Arrays

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        System.out.print(bingoCard[i][j] + ", ");
      }
    }
  }
}
