import java.util.Scanner;
class Main{
	public static void main (String[] args){
        // Type your code here
      Scanner s=new Scanner(System.in);
      int n=s.nextInt();
      int c,pro=1;
      for(int i=1; i<=n; i++)
      {
         pro=pro*i;
        //c=pro*i++;
      

      }
            System.out.println(pro);
	}
}