public class Test {
    int[] array;
    Test(int[] array){
        this.array=array;
    }
    int findSecondLargest(){
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=1;i<array.length;i++){
            if(array[i]>largest){
                secondLargest=largest;
                largest=array[i];
            }else if(array[i]<largest && array[i]>secondLargest){
                secondLargest=array[i];
            }
        }
        return secondLargest;
    }
}
