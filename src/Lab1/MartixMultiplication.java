/**
 * 
 */
package Lab1;

/**
 * @author Ankit.Mittal
 *
 */
public class MartixMultiplication {

	/**
	 * Martix Multiplication Program
	 */
	
	public int[][] MatrixMultiplication1(int[][] a, int[][]b) 
	{
		int[][] c=new int[a.length][b[0].length];

		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b[0].length;j++)
			{
				for(int k=0;k<a[0].length;k++)
				{
					c[i][j]=c[i][j]+a[i][k]*b[k][j];
				}
			}
		}
		
		return c;
	}
	
	public void displayMultiply(int[][] result) 
	{
		for(int a=0;a<result.length;a++)
		{
			for(int b=0;b<result[a].length;b++)
			{
				System.out.print("|"+result[a][b]);
			}
			System.out.println("|");
		}
	}
	public static void main(String[] args) {

		MartixMultiplication martixMultiplication=new MartixMultiplication();
		int[][] Matrix1={{1,2},{1,2},{1,2},{1,2}};
		int[][] Matrix2={{1,2,1,2},{1,2,1,2}};
		int[][] result= martixMultiplication.MatrixMultiplication1(Matrix1, Matrix2);
		martixMultiplication.displayMultiply(result);
	}

}
