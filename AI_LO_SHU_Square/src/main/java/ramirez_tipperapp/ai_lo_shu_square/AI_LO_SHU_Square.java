/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ramirez_tipperapp.ai_lo_shu_square;

/**
 *
 * @author angelramirez-rivera
 */
public class AI_LO_SHU_Square {

public static void main(String[] args) {

        int[][] arrOne = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 1, 6}
        };

        boolean isMagicSquareOne = checkMagicSquare(arrOne);
        printMagicSquare(arrOne);
        System.out.println("This is a magic square: " + isMagicSquareOne);

        int[][] arrTwo = {
            {4, 9, 2},
            {3, 5, 7},
            {8, 6, 1}
        };

        boolean isMagicSquareTwo = checkMagicSquare(arrTwo);
        printMagicSquare(arrTwo);
        System.out.println("This is a magic square: " + isMagicSquareTwo);
    }
 public static boolean checkMagicSquare(int[][] magicSquare) {
        int magicConstant = 15;

        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            int rowSum = 0;
            int colSum = 0;
            for (int j = 0; j < 3; j++) {
                rowSum += magicSquare[i][j];
                colSum += magicSquare[j][i];
            }
            if (rowSum != magicConstant || colSum != magicConstant) {
                return false;
            }
        }
         int mainDiagonalSum = magicSquare[0][0] + magicSquare[1][1] + magicSquare[2][2];
        int secondaryDiagonalSum = magicSquare[0][2] + magicSquare[1][1] + magicSquare[2][0];

        return mainDiagonalSum == magicConstant && secondaryDiagonalSum == magicConstant;
    }

    public static void printMagicSquare(int[][] magicSquare) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(magicSquare[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
