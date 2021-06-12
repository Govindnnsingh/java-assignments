import java.util.Scanner;

public class comparenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner in=new Scanner(System.in);
     int num1;
     int num2;
     System.out.println("enter number 1");
     num1=in.nextInt();
     System.out.println("enter number 2");
     num2=in.nextInt();
     if (num1==num2)
        System.out.println("numbers are equal==");
     if (num1!=num2)
         System.out.println("numbers are equal !=");
     if (num1<num2)
         System.out.println("numbers are equal < ");
     if (num1>num2)
         System.out.println("numbers are equal > ");
     if (num1<=num2)
         System.out.println("numbers are equal <= ");
     if (num1>=num2)
         System.out.println("numbers are equal >= ");
     
	}

}
