public class CallbyRef {
    int a = 70;

    public static void disp(CallbyRef b) {
        System.out.println(b.a);
    }

    public static void main(String[] args) {
        CallbyRef p = new CallbyRef();
        disp(p);
        //new CallbyRef();
    }
}
