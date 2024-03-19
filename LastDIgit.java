class LastDIgit {
    public static void main(String[] args) {
        int number= 65887567;
        int last_digit;
        int first_digit;
        last_digit = number % 10;
        first_digit = number /1000000;
        System.out.println("Last Digit of " + number + " is :" + last_digit);
        System.out.println("First Digit of " + number + " is :" + first_digit);
    }
    
}
