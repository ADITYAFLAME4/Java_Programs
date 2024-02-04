class CircleArea
{	
	static double pi = 3.142;
public static double circlearea(int rad)
{
	
	double res = pi*rad*rad;
	return res;
}

public static void main(String[]args)
{
	double area = circlearea(8);

	System.out.println("The area of circle is:" + area);
}


}