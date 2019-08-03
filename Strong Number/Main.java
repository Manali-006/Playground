import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
       Scanner s=new Scanner(System.in);
      int n=s.nextInt();
    int sum=0,fact,temp,rem,i;
      temp=n;
      //for(int i=1; i<=n; i++)
      while(temp>0)
        
      {
        fact=1;
        i=1;
        rem=temp%10;
        while(i<=rem)
        {
          fact=fact*i;
        i++;
      }
        sum=sum+fact;
      temp=temp/10;
        
       
      }
       //System.out.println(a);
      if(n==sum)
      System.out.println("Yes");
      else 
       System.out.println("No");
      
    }
	
}