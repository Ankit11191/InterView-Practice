/**
 * 
 */
package Lab1;

import java.util.Scanner;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog6 {

	/**
	 * WAP to Swap to no with third variable and without third varialble
	 */
	public int[] swap(int a, int b)
	{
		a=a+b;
		b=a-b;
		a=a-b;
		int[] retu={a,b};
		return retu;
	}
	
	public static void main(String[] args) 
	{
		Prog6 prog6 = new Prog6();
		Scanner scanner=new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		scanner.close();
		int[] result = prog6.swap(a, b);
		System.out.println("a:"+result[0]);
		System.out.println("b:"+result[1]);
	}

}
