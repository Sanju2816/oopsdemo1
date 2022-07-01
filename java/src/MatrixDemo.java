
public class MatrixDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[][]={{22,33,44},{34,56,67},{34,45,67}};
		int b[][]= {{22,33,44},{34,56,67},{34,45,67}};
		int c[][]=new int[3][3];
	
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+" ");
			}
			System.out.println();
		}

}
}