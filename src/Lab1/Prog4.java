/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog4 {

	/**
	 * WAP to String is palindrome or not;
	 * 
	 * will use split and then reverse
	 */
	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = scanner.nextLine();
		scanner.close();
		String[] aaa=str.split(" ");
		String[] rev=new String[aaa.length];
		
		for(int i=0;i<aaa.length;i++)
		{
			String rever = "";
			for(int j=aaa[i].length()-1;j>=0;j--)
			{
				rever=rever+aaa[i].charAt(j);
			}
			rev[i]=rever;
		}
		for(String aaaa:rev)
		{
			System.out.print(aaaa+" ");
		}
	}
}
