import java.util.Scanner;
public class Main{
	public static void main (String[] args)
	{
	    // Type your code here
      Scanner in =new Scanner(System.in);
      int n1 = in.nextInt();
	    int n2 = in.nextInt();
	    int n3 = in.nextInt();
	    int result =gcd(n1,n2);
      System.out.print(gcd(result,n3));
	}
  public static int gcd(int  a,int b)
  {
   //while(c>=1)
    int g=1;
    for(int i=1; i<=a && i<=b; i++) 
    if(a%i==0  && b%i==0)
      g=i;
       return g;
  
  
      
}   
    
  
}