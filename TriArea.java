class TriArea
{
public static double TriangleA(int base, int height)
{
double area = 0.5*base*height;
return area;
}
public static void main(String[]args)
{
double area =TriangleA(4,6);
System.out.println(area);
}
}