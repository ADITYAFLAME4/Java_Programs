class SWC_Calculator 
{
	public static void main(String[] args) 
	{
		int a = 6, b =  3;
		char choice;

		// Assign: '+' , '-' , '*' , '/' any of this Character value in choice variable. Anything except this will give Invalid Input.

		choice = '*' ;

		switch(choice)
		{
			case '+':
				System.out.println("The addition is:" + (a+b));

				break;


			case '-':
				System.out.println("The Substraction is:" + (a-b));

				break;


			case '*':
				System.out.println("The Multiplication is:" + (a*b));

				break;


			case '/':
				System.out.println("The Division is:" + (a/b));

				break;


			default:
				System.out.println("Invalid Input!");
		}
	}
}
