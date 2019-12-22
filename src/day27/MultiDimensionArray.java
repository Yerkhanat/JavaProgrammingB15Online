package day27;

public class MultiDimensionArray {
    public static void main(String[] args) {
        /*
        Single dimensional array: contains values
        int [] arr = {1,2,3};
        Multi- Dimensional array: an Array that can contain arrays(s);
        N dimensional array contains (N-1) dimensional arrays

         */
    int [] arr1D= {1,2,3};
    int [] [] arr2D = {{1,2,3} , {4,5,6}, {7,8,9}};
        for (int i = 0; i <arr2D.length ; i++) {

            for (int j = 0; j <arr2D[i].length ; j++) {
                System.out.print(arr2D[i][j]+" - ");

            }


        }



    }
}
