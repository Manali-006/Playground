import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner s=new Scanner(System.in);
      int op=s.nextInt();
      switch(op)
      {
        case 1:if(op==1)
          System.out.println("One");
          break;
          case 2:if(op==2)
          System.out.println("Two");
          break;
          case 3:if(op==3)
          System.out.println("Three");
          break;
          case 4:if(op==4)
          System.out.println("Four");
          break;
          case 5:if(op==5)
          System.out.println("Five");
          break;
        default:System.out.println("Invalid");
      }
      
	}
}