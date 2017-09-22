/**
 * 
 */
package Lab1;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog16 {

	/**
	 * WAP to Find largest no in Array
	 */
	public static int MaximumArray(int[] number)
	{

		int max=number[0];
		for(int a=0;a<number.length;a++)
		{
			if(max<number[a])
			{
				max=number[a];
			}
		}
		return max;
	}
	public static void main(String[] args) 
	{
		int[] number={1,2,3,2,2,222,3,4,2,112,1,1,1,1};
		System.out.println(MaximumArray(number));
	}

}
