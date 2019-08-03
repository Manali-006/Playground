import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here 
      Scanner s=new Scanner(System.in);
      int m=s.nextInt();
     int sum=0,n;
      while(m>0)
      {
        n=m%10;
          sum=sum+n;
        m=m/10;
      }
      System.out.println(sum);
	}
}