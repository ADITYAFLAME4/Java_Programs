public class StringTypeArray {
    public static void main(String[] args) {
        String [] arr = {"A","AB", "ABC", "ABCD"};

        // Normal For loop (Works Fine)

        // for(int i = 0; i < arr.length; i++)
        // {
        //     System.out.println(arr[i]);
        // }

        // For Each Loop
        
        for(String element:arr)
        {
            System.out.println(element);
        }
    }
}
