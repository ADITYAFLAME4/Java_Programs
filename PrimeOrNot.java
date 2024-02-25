public class PrimeOrNot {
    public static void main(String[] args) {
        int number = 2,count = 0;
        for(int i = 0; i < number; i++)
        {
            if(number % i ==0)
            {
                count++;
            }
        }

        if(count == 2)
        {
            System.out.println(number + "is prime Number");
        }
        else
        {
            System.out.println(number + "is not prime Number");
        }
    }
}
