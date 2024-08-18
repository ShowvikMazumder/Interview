import java.util.Arrays;

public class Test {
    String input_string;
    Test(String input_string){
        this.input_string=input_string;
    }
//    String reverse() {
//        return new StringBuilder(input_string).reverse().toString();
//    }
    // The process applies similar method under the hood
    String reverse(){
        char[] array_of_string=input_string.toCharArray();
        for(int i=0;i<array_of_string.length/2;i++){
            char temp=array_of_string[i];
            array_of_string[i]=array_of_string[array_of_string.length-1-i];
            array_of_string[array_of_string.length-1-i]=temp;
        }
        return new String(array_of_string);
    }
}
