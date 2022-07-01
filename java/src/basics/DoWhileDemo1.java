package basics;

//to display multiplication table
public class DoWhileDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row,column;
		System.out.println("**********************MULTIPLICATION TABLE**********************");
		row=1;
		do {
			column=1;
			do
			{
				int mul=row*column;
				System.out.print(mul+"\t");
				column++;
			}while(column<=10);
			
			System.out.println();
			row=row+1;
		}while(row<=5);

	}

}
