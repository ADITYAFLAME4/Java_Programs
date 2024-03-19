class SibIib {

    static{
        System.out.println("SIB-1");
    }

    static{
        System.out.println("SIB-2");
    }

    {
        System.out.println("IIB-1");
    }
    
    {
        System.out.println("IIB-2");
    }

    public static void main(String[] args) {
        System.out.println("This is main method start!");

        SibIib si = new SibIib();
        System.out.println("Address stored in reference variable is: "+ si);

        System.out.println("This is main method end!");
    }
}