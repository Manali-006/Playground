import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
              
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.print(sum(n));
	}
  public static int sum(int a)
  {
    int r=0;
    for(int i=0; i<=a; i++)
    
      r=r+i;
      
      return r;
    
  }   
}