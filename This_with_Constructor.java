public class This_with_Constructor {
    
    int x=20;


    //Constructor
    This_with_Constructor(int x)
    {
        this.x = x;
    }
    public static void main(String[] args) {
        //Objet Creation , twc is instance Variable
        This_with_Constructor twc = new This_with_Constructor(840);

        System.out.println(twc.x);
    }
}
