public class ToCharArrayExmp {
    public static void main(String[] args) {
        
        String s = "QSPIDERS";

        char[] ch = s.toCharArray(); // {'Q','S','P','I','D','E','R','S'}

        for(char elements: ch)
        {
            System.out.println(elements);
        }
    }
}
