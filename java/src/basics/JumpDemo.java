package basics;

public class JumpDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j;
		System.out.println("********************break demo*********************");
		for( i=1;i<=10;i++)
		{
			if(i==8)
			{
				break;
			}
			System.out.println(i+ "sanju");
		}
		System.out.println("*****************continue demo********************");
		for(j=1;j<10;j++)
		{
			if(j==8)
			{
				continue;
			}
			System.out.println(j);
		}

	}

}
