class Para_ret
{
public static int add(int num1, int num2)
{
	int res = num1+num2;
	return res;
}

public static int subs(int num1, int num2)
{
	int sub = num1-num2;
	return sub;
}

public static int multi(int num1, int num2, int num3)
{
	int mul = num1*num2*num3;
	return mul;
}

public static void main(String[]args)
{
	int sum	= add(4,6);
	int sub	= subs(4,6);
	int mul = multi(4,5,6);
	System.out.println("The Sum is:"+ sum);
	System.out.println("The Subtraction is:"+sub);
	System.out.println("The Multiplication is:"+mul);
}
}