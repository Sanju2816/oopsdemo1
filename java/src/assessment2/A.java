package assessment2;
class A
{
    static String m(float l)
    {
        return "float";
    }
    static String m(double l)
    {
        return "double";
    }
    public static void main(String[] args)
    {
        int a1=1;
        int b1=2;
        System.out.println(m(a1)+","+m(b1));
    }
		
	
}