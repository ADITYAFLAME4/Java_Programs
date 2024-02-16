class OddOrEven 
{
	public static String OddEven(int num)
	{	

		if(num % 2 == 0)
		{
			return	"The number " + num + " is " + " Even Number!"; 
		}

		else
		{
			return "The number " + num + " is " + " Odd Numbber!";
		}
	}



	public static void main(String[] args) 
	{
		int a = 7;
		String result = OddEven(a);

		System.out.println(result);
		
	}
}
