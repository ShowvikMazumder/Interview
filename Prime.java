public class Test {
  int number;
  Test(int number){
      this.number=number;
  }
  boolean isPrime(){
      if(number%2!=0 || number==2){
          int count=0;
          for(int i=1;i<=Math.sqrt(number);i+=2){
              if(number%i==0) count++;
          }
          return count == 1;
      }
      return false;
  }
}
