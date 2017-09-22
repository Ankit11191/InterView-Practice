/**
 * 
 */
package Lab1;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog14 {

	/**
	 * WAP to no is binary or not?
	 */
	public boolean isBinary(int a) 
	{
		while(a!=0)
		{
			if(a%10>1)
			{
				
				return false;
			}
			a/=10;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		int aaa=101010;
		Prog14 prog14=new Prog14();
		boolean result=prog14.isBinary(aaa);
		System.out.println(result);
	}

}
