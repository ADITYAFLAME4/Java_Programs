class ConSt {
    
    public static void main(String[] args) {
        DemoCon akash = new DemoCon(70);

        System.out.println(akash.x);
    }
}

class DemoCon{
    int x;

    DemoCon (int y)
    {
        x=y;
    }
}
//User Defined Parameterized Constructor.