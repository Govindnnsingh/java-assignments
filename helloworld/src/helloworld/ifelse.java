package helloworld;
import java.util.Scanner;
public class ifelse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("input number :");
		int num=in.nextInt();
		if (num>0) {
			System.out.println("+ve number");
		}
		else if (num==0) {
			System.out.println("number is zero");
		}
		else if (num<0){
			System.out.println("-ve number");
		}
		else {
			System.out.println("enter valid number");
		}
	}

}
