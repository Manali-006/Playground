import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 // Type your code here   
           
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      System.out.print(s(n));
      
	}
  public static int s(int a)
  {
    int r=a*a;
  return r;
}
}