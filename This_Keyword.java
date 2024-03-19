public class This_Keyword {
    int x; // GLobal Variabele

    public void m1(int x)
    {
        this.x = x;
    }

    public static void main(String[] args) {
        This_Keyword tk = new This_Keyword();
        tk.m1(70);

        System.out.println(tk.x);
    }

}
