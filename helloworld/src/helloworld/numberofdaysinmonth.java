package helloworld;
import java.util.Scanner;

public class numberofdaysinmonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int num;
   Scanner in=new Scanner(System.in);
   System.out.print("please eneter  any number");
   num=in.nextInt();
   if( (num%5==0) &&(num%11==0))
   {
	   System.out.println("given number " +num+ " is divisible by 5 and 11");
   }
   else {
	   System.out.println("not divisible ");
   }
   
	}

}
