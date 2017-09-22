package Lab1;

import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Ankit.Mittal
 *
 */
public class ReplaceString {

	/**
	 * program to replace certain characters from String like
	 */
	public static void main(String[] args) 
	{
		int min=1000000; int max=9999999;
		Random random=new Random();
		String string="this is ankit";
		String bbb="ankit-"+random.nextInt(max-min+1);
		Pattern pattern=Pattern.compile("ank\\w+");
		Matcher matcher=pattern.matcher(string);
		String update = "";
		while(matcher.find())
		{
			update=matcher.group();
		}
		
		System.out.println(string.replaceAll(update, bbb));
	}

}
