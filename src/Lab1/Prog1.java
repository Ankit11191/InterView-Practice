package Lab1;

import java.util.Scanner;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog1 {

	/** WAP to Reverse Number */
	public static void main(String[] args) {
		int Reverse=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Pelase enter number to be Reverse");
		
		int number=scanner.nextInt();
		while(number!=0)
		{
			int temp=number%10;
			Reverse = Reverse*10+temp;
			number=number/10;
		}
		
		System.out.println(Reverse);
		
		scanner.close();

	}

}
