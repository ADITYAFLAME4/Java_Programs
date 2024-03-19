class Practice
{
    public static void main(String[] args) 
    {
       int limit = 100;
       int count;

       for(int i = 1 ; i<= limit; i++)
      {
        count = 0;
        for(int j =1; j<=i; j++ )
            {
                if(i%j==0)
                    count++;
            }
            if(count == 2)
            {
                System.out.println(i + " is prime number!");
            }
       }
    }
}