class Addition
{
	public static int add(int a, int b)
	{
		return a+b;
	}
}

class Multiplication
{
	public static int mul(int a, int b)
	{
		return a*b;
	}
}

class Substraction
{
	public static int sub(int a, int b)
	{
		return a-b;
	}
}

class Division
{
	public static double div(int a, int b)
	{
		return a/b;
	}
}


class Calculator
{
	public static void main(String[] args) 
	{
		int var1 = 5 , var2= 10;
		int s = Addition.add(var1, var2);
		int m = Multiplication.mul(var1, var2);
		int sb = Substraction.sub(var1, var2);
		double d = Division.div(var1, var2);


		System.out.println("The addition is:" + s);
		System.out.println("The multiplication is:" + m);
		System.out.println("The substraction is:" + sb);
		System.out.println("The division is:" + d);
	}
}
