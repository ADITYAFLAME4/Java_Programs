public class Nonstatic {
    public int sum()
    {
        int a=6,b =2;
        return a+b;
    }

    public static void main(String[] args) {
        int add =new Nonstatic(). sum();
        System.out.println(add);
    }


}
