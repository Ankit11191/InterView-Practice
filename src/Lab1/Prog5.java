/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog5 {

	/**
	 * WAP to String is palindrome or not
	 */
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String value = "ankikna";
		scanner.close();
		String reverse="";
		for(int i=value.length()-1;i>=0;i--)
		{
			reverse=reverse+value.charAt(i);
		}
		if(value==reverse)
		{
			System.out.println("Not palindrome");
		}
		else
		{
			System.out.println("palindrome");
		}

	}

}
