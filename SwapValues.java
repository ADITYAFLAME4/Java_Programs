class SwapValues
{
public static void main(String[]args)
{
int a = 10;
int b = 20;
//Before Swap Value

System.out.println("a:"+ a);
System.out.println("b:"+ b);

//Swap WIthout 3rd variable

a= a+b;
b= a-b;
a= a-b;

System.out.println("a:"+ a);
System.out.println("b:"+ b);
}
}