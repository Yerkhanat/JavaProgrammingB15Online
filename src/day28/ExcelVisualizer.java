package day28;

import java.util.Arrays;

public class ExcelVisualizer {
    public static void main(String[] args) {

        int [] row1 = new int[] {78,54,100,84};
        int [] row2 = new int[] {33,44,77,123};
        int [] row3 = new int[] {12,88,52,76};
        int [] row4 = new int[] {67,33,98,67};
        int [] row5 = new int[] {12,88,52,45};
        int [] row6 = new int[] {67,33,98,34};
        // store this in on object

        int [] [] sheet = new int[][]{row1, row2, row3, row4, row5, row6};
        System.out.print(Arrays.deepToString(sheet));


    }
}
