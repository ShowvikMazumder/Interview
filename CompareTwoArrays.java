import java.util.HashSet;
import java.util.Set;

public class Test {
    int [] array1;
    int [] array2;
    Test(int[] array1,int[] array2){
        this.array1=array1;
        this.array2=array2;
    }
    boolean compare(){
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for(int element:array1){
            set1.add(element);
        }
        for(int element:array2){
            set2.add(element);
        }
        return set2.containsAll(set1);
    }
}
