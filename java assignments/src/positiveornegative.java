import java.util.Scanner;

public class positiveornegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.print("enter number");
		int num=in.nextInt();
		if (num<0) {
			System.out.println("number is -ve");
		}
		else {
			System.out.println("number is +ve");
		}

	}

}
