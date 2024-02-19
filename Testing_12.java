class Testing_12 
{
	public static void main(String[] args) 
	{

		int a =10;
		int b = 5;

		a = a++ + ++a;
		b= a++ + b++;
		System.out.println(a);
		System.out.println(b);
	}
}
