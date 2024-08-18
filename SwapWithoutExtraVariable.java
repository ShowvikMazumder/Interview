public class Test {
    int num_1;
    int num_2;

    Test(int num_1,int num_2){
        this.num_1=num_1;
        this.num_2=num_2;
    }
    int[] swap(){
        num_1=num_1+num_2;
        num_2=num_1-num_2;
        num_1=num_1-num_2;
        return new int[]{num_1,num_2};
    }
}
