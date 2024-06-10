public class SwitchCaseJDK17 {

    public static void main(String[] args) {

        String day = "Sunday";
        String result = "";

        // Old Switch Case Statement (Works on newer Java Versions as well.) , Break keyword is mandetory here.
        //Type :1

        // switch (day) {
        // case "Monday":
        // System.out.println("6am");
        // break;
        // case "Tuesday":
        // System.out.println("6am");
        // break;
        // case "Wednesday":
        // System.out.println("6am");
        // break;
        // case "Thursday":
        // System.out.println("6am");
        // break;
        // case "Friday":
        // System.out.println("6am");
        // break;
        // case "Saturday","Sunday":
        // System.out.println("8am");
        // break;
        // default:
        // System.out.println("5am");
        // }


        // New Switch Case Statement , To skip break keyword we write in this way.
        //Type:2


        // switch (day) {
        //     case "Monday" -> System.out.println("6am");
        //     case "Tuesday" -> System.out.println("6am");
        //     case "Wednesday" -> System.out.println("6am");
        //     case "Thursday" -> System.out.println("6am");
        //     case "Friday" -> System.out.println("6am");
        //     case "Saturday", "Sunday" -> System.out.println("8am");
        //     default -> System.out.println("5am");
        // } 
        
        //Note: We Either can use colon (:) or can use Arrow (->), We can't use both in one switch Case

        //When We need to Assign Switch Value into some variable.
        //Type:3

        // result = switch (day) {
        //     case "Monday" -> "6am";
        //     case "Tuesday" -> "6am";
        //     case "Wednesday" -> "6am";
        //     case "Thursday" -> "6am";
        //     case "Friday" -> "6am";
        //     case "Saturday", "Sunday" -> "8am";
        //     default -> "5am";
        // }; 

        // System.out.println(result);


       //Type:4 

       result = switch (day) {
        case "Monday": yield "6am";
        case "Tuesday": yield "6am";
        case "Wednesday": yield "6am";
        case "Thursday": yield "6am";
        case "Friday": yield "6am";
        case "Saturday", "Sunday":yield "8am";
        default: yield "5am";
    }; 

    System.out.println(result);




    }

}
