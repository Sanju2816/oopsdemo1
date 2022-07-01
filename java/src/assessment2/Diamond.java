package assessment2;

public class Diamond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=3;i++)
		{
			for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=2*i+1;j++)
			{
				System.out.print("*");
			}
			
			System.out.println("");
			
			}
		for(int i=0;i<=3-1;i++)
		{
			for(int k=0;k<=i+1;k++)
			{
				System.out.print(" ");
			}
			for(int j=(3-i)*2-1;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
