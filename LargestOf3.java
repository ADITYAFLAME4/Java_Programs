class LargestOf3 
{
	public static void main(String[] args) 
	{
		int a = 5, b = 40 , c = 5;

		//If All the numbers are same!
		if(a==b && a==c)
			System.out.println("All the numbers are Same!");

		//If No number is same!
		else if(!(a==b) && !(a==c) && !(b==c))
		{
			
			if(a>b && a>c)
				System.out.println("a is the largest number!");

			else if(b>a && b>c)
				System.out.println("b is the greatest number!");

			else
				System.out.println("c is the greatest number!");
		}

		//If any one pair among 3 is same!
		else
		{
			if(a==b)
			{
				if(a>c)
					System.out.println("a and b is greater than c");
				
				else
					System.out.println("c is greater than a and b");
			}
			else if(a==c)
			{
				if(a>b)
					System.out.println("a and c is greater than b");

				else
					System.out.println("b is greater than a and c");
			}
			else
			{
				if(b>a)
					System.out.println("b and c is greater than a");
			
				else
					System.out.println("a is greater than b and c");
				}
			}


		}
	}
}
