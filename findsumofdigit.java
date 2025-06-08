import java.util.*;


public class Main {
    public static int findsum(int num){
       int count=0;int sum=0;
      while(num>0){
        sum=sum+num%10;
        num=num/10;
        count+=1;
      }
      return sum;
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num=sc.nextInt();
      System.out.println(findsum(num));
      
     
  }
}
