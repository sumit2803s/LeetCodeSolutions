class Solution {
    public void rotate(int[][] matrix) {
         for(int i =0;i<matrix.length-1;i++){
            for(int j =i+1;j<matrix[0].length;j++){
                int temp = matrix[i][j];
                matrix[i][j] =matrix[j][i];
                matrix[j][i]= temp;
            }
        }

        for(int i =0;i<matrix.length;i++){
            reverse(matrix[i]);
        }
         
    }

    private void reverse(int[]arr){
        int i =0;
        int j = arr.length-1;
        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}