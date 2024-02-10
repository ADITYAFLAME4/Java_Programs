class Method_test1
{
public static int print(int x,int y)
{
	return x+y;	
}
public static void main(String[]args)
{	int sum,sub;
	sum =print(5,15);
	sub =Method_test2.print2(6,2);
	System.out.println(sum);
	System.out.println(sub);
}

}