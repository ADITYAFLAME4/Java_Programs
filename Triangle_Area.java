class Triangle_Area
{
	public static double TriangleA(int base, int height)
	{
	double area = (1/2)*base*height;
	return area;
	}

	public static void main(String[]args)
	{
	double area =TriangleA(4,6);
	System.out.println(area);
	}

}