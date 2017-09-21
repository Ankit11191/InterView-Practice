/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog3 {

	/**
	 * WAP to count no of word in String;
	 * 
	 * Will loop
	 */
	public static void main(String[] args) {
		
		int count=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String string = scanner.next();
		for(int i=0;i<string.length();i++)
		{
			count++;
		}
		System.out.println(count);
		scanner.close();

	}

}
