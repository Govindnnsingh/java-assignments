import java.util.Scanner;

public class daynameafterenteringdaysofweek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in=new Scanner(System.in);
System.out.println("enter day number");
int day=in.nextInt();
switch (day) {
case 1:
	System.out.println("Monday");
	break;
case 2:
	System.out.println("Tuesday");
	break;
case 3:
	System.out.println("Wednesay");
	break;
case 4:
	System.out.println("Thurday");
	break;
case 5:
	System.out.println("Frday");
	break;
case 6:
	System.out.println("Saturday");
	break;
case 7:
	System.out.println("Sunday");
	break;
default:
	System.out.println("Invalid");
	break;
	
	
         }
	}

}
