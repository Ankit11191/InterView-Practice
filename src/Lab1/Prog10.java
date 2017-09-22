package Lab1;

/** @author Ankit.Mittal * */
public class Prog10 {

	/** WAP to insertion Sort	 */
	public int[] insertionSort(int[] unsorted)
	{
		int n=unsorted.length;
		for(int i=1;i<n;i++)
		{
			int key=unsorted[i];
			int j=i-1;
			while(j>-1 && unsorted[j]>key)
			{
				unsorted[j+1]=unsorted[j];
				j--;
			}
			unsorted[j+1]=key;
		}
		return unsorted;
	}
	
	public static void main(String[] args) {
	
		int[] Unsorted={1,2,3,3,4,2,5,2,3,234,23,4,2};
		Prog10 prog10=new Prog10();
		int[] sorted= prog10.insertionSort(Unsorted);
		for(int i=0;i<sorted.length;i++)
		{
			System.out.print(sorted[i]+",");
		}
	}

}
