/**
 * 
 */
package Lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog2 {

	/**
	 * WAP to count duplicate character in String
	 * 
	 * we can use array also to solve this program but in that we need to run iteration(loop) 2 time
	 * with Map and set we need to run script only 1 time so as performance wise this is better
	 */
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter string with duplicate character");
		String name=scanner.next();

		Map<Character, Integer> duplicateChar=new HashMap<Character, Integer> ();
		char[] cha=name.toCharArray();
		for(Character ch:cha)
		{
			if(duplicateChar.containsKey(ch))
			{
				duplicateChar.put(ch, duplicateChar.get(ch)+1);
			}
			else
			{
				duplicateChar.put(ch, 1);
			}
		}
		
		Set<Character> duplicate=duplicateChar.keySet();
		for(Character ch:duplicate)
		{
			if(duplicateChar.get(ch)>1)
			{
				System.out.println(ch+">>>>"+duplicateChar.get(ch));
			}
		}
		scanner.close();
	}

}
