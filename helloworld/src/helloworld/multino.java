package helloworld;
import java.util.Scanner;
public class multino {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in=new Scanner(System.in);
		int num;
		int r1,r2,r3=0;
		System.out.println("enter number");
		num=in.nextInt();
		if (num%2==0) {
			System.out.println("number is even ");
		}
		else {
			System.out.println("number is not  even ");

}
		if (num<0) {
			System.out.println("number is -ve number ");
		}
		else {
			System.out.println("number is +ve number ");
		}
		
		r1=num%10;
		num=num/10;
		r2=num%10;
		r3=num/10;
		System.out.println("reverse of number are"+r1+r2+r3);
		System.out.println("sum of diditss ");
		System.out.println(r1+r2+r3);
		
	}
}
