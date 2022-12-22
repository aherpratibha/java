package asha;

public class Identifier {
	int a=25;    //global//instance
	static int b=89;  //global//class/static
	
	
	public static void main (String []args)
	{
		int a=25;
		String s="pratibha";
		System.out.println(a);
		System.out.println(s);
		Identifier ref= new Identifier ();
		System.out.println(ref.a);
		System.out.println(ref.b);
	
	}
}