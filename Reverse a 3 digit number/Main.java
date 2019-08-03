import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code   
    Scanner s=new Scanner(System.in);
      int a=s.nextInt();
     int b=a/100;
      int c=((a/10)%10);
    int d=a%10;
   int rev=(d*100)+(c*10)+b;
      System.out.println(rev);
  }
}