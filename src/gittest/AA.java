package gittest;

public class AA {
	public AA()
	{
		this(47);
		System.out.println("1st constructor");
	}
	public AA(int a)
	{
		this(45,"shubham");
		System.out.println("2nd constructor");
	}
	public AA(int a,String x)
	{
		System.out.println("3nd constructor");
	}
	
	
	public static void main(String[] args) {
		//AA S=new AA();
		AA w=new AA(76);
		
		//done it code
		
	}
}
