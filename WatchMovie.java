class Animal
{
    public void rashmikaMandhana()
    {
        System.out.println("Bhabi-1");
    }
}

class Rupam
{
    public static void WatchRupam(Animal a1)
    {
        a1.rashmikaMandhana();
    }
}

class Akash
{
    public static void WatchAkash(Animal a2)
    {
        a2.rashmikaMandhana();
    }
}



public class WatchMovie {
    public static void main(String[] args) {
        Animal a = new Animal();
        Rupam.WatchRupam(a);
        Akash.WatchAkash(a);
    }
    
}
