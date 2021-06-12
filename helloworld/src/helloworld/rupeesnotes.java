package helloworld;
import java.util.Scanner;

public class rupeesnotes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Scanner in=new Scanner(System.in);
   int rupee;
   System.out.println("enter rupees of notes");
   rupee=in.nextInt();
   
   System.out.println("no of 500 rupee note are "+(rupee/500));
   System.out.println("no of 100 rupee note are "+(rupee%500/100));
   System.out.println("no of 50 rupee note are "+(rupee%500%100/50));
   System.out.println("no of 20 rupee note are "+(rupee%500%100%50/20));
   System.out.println("no of 10 rupee note are "+(rupee%500%100%50%20/10));
   
   }
    
}
