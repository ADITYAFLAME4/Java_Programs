class Areas
{
	static double pi = 3.142;
public static void circle()
{
	int r = 5;
	double res = pi*r*r;
	System.out.println("THE AREA OF CIRCLE IS:"+ res );
}

public static void triangle()
{
	int base = 5;
	double hight = 6.7;
	double area = (1/2)*base*hight;
	System.out.println("THE AREA OF TRIANGLE IS:" + area );
}

public static void rectangle()
{
	int width = 8;
	double hight = 4.5 ;
	double area = width * hight;
	System.out.println("THE AREA OF RECTANGELE IS:" + area);

}

public static void trapezoid()
{
	int a = 5;
	int b = 8;
	int v_h = 9;
	double area = (1/2)*(a+b)*v_h;
	System.out.println("THE AREA OF TRAPEZOID IS:" + area);
}

public static void ellipse()
{
	double h_miax = 4.5;
	double h_maax = 9.2;
	double area = pi * h_miax * h_maax;
	System.out.println("THE AREA OF ELLIPSE IS:" + area);
}

public static void square()
{
	int len = 8;
	int area = len* len;
	System.out.println("THE AREA OF SQUARE IS:" + area);
}

public static void parallelogram()
{
	int base = 8;
	double v_H = 4.5;
	double area = base * v_H;
	System.out.println("THE AREA OF PARALLELOGRAM IS:" + area);
}

public static void sector()
{
	int The_ta = 60;
	double rad = 6.8;
	double area = (( rad * rad) * The_ta ) / 2 ;
	System.out.println("THE AREA OF SECTOR IS:" + area);
}
public static void main(String[]args)
{
	circle();
	triangle();
	sector();
	parallelogram();
	ellipse();
	trapezoid();
	rectangle();
}
}