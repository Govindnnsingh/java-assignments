package helloworld;
import java.util.Scanner;

public class noofdaysinmomth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int no_of_dayofmonth=0;
		String Monthname="unknown";
		System.out.print("enter a month number");
		int month=in.nextInt();
				System.out.print("enter a year");
				int year=in.nextInt();
				switch (month) {
				case 1:
					Monthname="january";
					no_of_dayofmonth=31;
					break;
				case 2:
					if((year%400==0)||((year%4==0)&&(year%100!=0))) {
						no_of_dayofmonth=29;
						}else {
							no_of_dayofmonth=28;	
						}
						break;
				case 3:
					Monthname="march";
					no_of_dayofmonth=31;
					break;
				case 4:
					Monthname="april";
					no_of_dayofmonth=30;
					break;
				case 5:
					Monthname="may";
					no_of_dayofmonth=31;
					break;
				case 6:
					Monthname="june";
					no_of_dayofmonth=30;
					break;
				case 7:
					Monthname="july";
					no_of_dayofmonth=31;
					break;
				case 8:
					Monthname="august";
					no_of_dayofmonth=31;
					break;
				case 9:
					Monthname="september";
					no_of_dayofmonth=30;
					break;
				case 10:
					Monthname="october";
					no_of_dayofmonth=31;
					break;
				case 11:
					Monthname="november";
					no_of_dayofmonth=30;
					break;
				case 12:
					Monthname="december";
					no_of_dayofmonth=31;
					break;
				}
			System.out.println(Monthname + " " + year + " has " + no_of_dayofmonth + " days\n ");
;
	}

}
