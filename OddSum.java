public class OddSum {
    public static void main(String[] args) {
        int sum = 0;
        int sum1 =0;

        for(int i=1; i<=10; i++)
        {
            if(!(i%2==0))
            {
                sum = sum+i;
            }
            else
                sum1 = sum1 +i;
        }
        System.out.println("ODD:" + sum);

        System.out.println("EVEN:" + sum1);
    }
}
