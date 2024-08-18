public class Test {

    void generatePyramid(int row, int column){
        int [][] pyramid = new int[row][column];

        for(int i=1;i<row;i++){
            for(int s=1;s<=row-i;s++){
                System.out.print("  ");
            }
            for(int j=1;j<=i*2-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
