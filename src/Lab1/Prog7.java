/**
 * 
 */
package Lab1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog7 {

	/**
	 * WAP to remove duplicate element in Array
	 */
	public int[] removeDuplicate(int[] element) 
	{
		Map<Integer, Integer> duplicateElement=new HashMap<Integer, Integer>();
		for(Integer aaa: element)
		{
			if(duplicateElement.containsKey(aaa))
			{
				duplicateElement.put(aaa, duplicateElement.get(aaa)+1);
			}
			else
			{
				duplicateElement.put(aaa, 1);
			}
		}
		Set<Integer> aaa =duplicateElement.keySet();
		int index = 0;
		for(int val:aaa)
		{
			element[index++]=val;
		}
		return element;
	}
	public static void main(String[] args)
	{
		Prog7 prog7=new Prog7();
		int[] aaa={10,11,12,12,13,13,13,13,13,13,14,15,9};
		int[] bbb=prog7.removeDuplicate(aaa);
		for(int ccc:bbb)
		{
			System.out.println(ccc);
		}
	}

}
