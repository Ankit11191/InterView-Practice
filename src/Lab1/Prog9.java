/**
 * 
 */
package Lab1;

/**
 * @author Ankit.Mittal
 *
 */
public class Prog9 {

	/**
	 * WAP to Bubble Sort
	 */
	public int[] bubbleSort(int[] unsorted)
	{
		for(int i=0;i<unsorted.length-1;i++)
		{
			for(int j=0;j<unsorted.length-i-1;j++)
			{
				if(unsorted[j]>unsorted[j+1])
				{
					int temp=unsorted[j];
					unsorted[j]=unsorted[j+1];
					unsorted[j+1]=temp;
				}
			}
		}
			
		return unsorted;
	}
	public static void main(String[] args) 
	{
		Prog9 prog9=new Prog9();
		int[] unsort={1,11,1,2,1,1,1,12,1,3,4,4,5,3,2,2,11,1,2,1,1,1,12,11,1,2,1,1,1,12,11,1,2,1,1,1,12,11,1,2,1,1,1,12,11,1,2,1,1,1,12};
		int[] sorted= prog9.bubbleSort(unsort);
		for(int sort:sorted)
		{
			System.out.print(sort+",");
		}

	}

}
