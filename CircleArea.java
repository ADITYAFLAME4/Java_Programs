class CircleArea
{	
	static double pi = 3.142;
public static double circlearea( double rad)
{
	
	double res = pi*rad*rad;
	return res;
}

public static void main(String[]args)
{
	double area = circlearea(5.89);

	System.out.println("The area of circle is:" + area);
}


}