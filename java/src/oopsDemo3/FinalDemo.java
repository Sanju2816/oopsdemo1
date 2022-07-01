package oopsDemo3;


final class Hello
{
    final void display()
    {
        System.out.println("This is a final Method");
    }
}
/*
class World extends Hello  // final classes cannot be extended
{
    // final methods cannot be overridden
    final void display()
    {
        System.out.println("This is a final Method");
    }
} */

public class FinalDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int  AGE=20;
        final float PI=3.142f;
        //AGE=30;//compilation error as final local variable value cannot be changed

	}

}
