class Swap_Digit
{
public static void main(String[]args)
{
int a = 87;
int fstDigit;
int sndDigit;

fstDigit=a/10;
sndDigit=a%10;

//New a value will be

a = (sndDigit*10)+fstDigit;

System.out.println(a);
}
}