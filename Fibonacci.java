import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Test {
  int number;
  Test(int number){
      this.number=number;
  }
  int[] findFibonacciSeries(){
    int[] fib = new int[number];
    fib[0]=0;
    fib[1]=1;
    for(int i=2;i<number;i++){
        fib[i]=fib[i-1]+fib[i-2];
    }
    return fib;
  }
  int helper(int num){
    if(num<=1) return 1;
    return helper(num-1)+helper(num-2);
  }
  int fibonacciNumber(){
    return helper(number);
  }
}
