package eBebek;

public class TransposeOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{5,6,4}};
        transpose(arr);
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }

    public static int[][] transpose(int[][] arr){
        int[][] temp = new int[arr[0].length][arr.length];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                temp[j][i] = arr[i][j];
            }
        }

        return temp;

    }
}
