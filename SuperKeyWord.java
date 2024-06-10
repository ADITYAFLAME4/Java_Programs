class Whatsapp1{
    public void status()
    {
        System.out.println("Text , Images");
    }
}


class Whatsapp2 extends Whatsapp1{
    public void status()
    {
        System.out.println("Text , Images , Video , Gifs");

       super.status();
    }
}


public class SuperKeyWord {
    
    public static void main(String[] args) {
        Whatsapp2 w = new Whatsapp2();

        w.status();
    }
}
