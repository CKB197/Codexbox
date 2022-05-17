public class ControlStatements {
    //if condition
    public static void main(String[] args) {
        int i=5;
        if(i<4)
            System.out.println("5 is greater than 4");
        System.out.println("I'm not if");
        //if-else condition
        int a=10;
        if(a<8)
            System.out.println("a is not less than 8");
        else
            System.out.println("a is greater than 8");
        //nested-if condition
        int b=15;
        if(b==15)
            // First if statement
            if (b<18)
            System.out.println("b is less than 18");
        //nested if-statement
        // it will be executed only if above statement is true.
        if (b<20)
            System.out.println("b is less than 20 too");
        else
            System.out.println("b is graeter than 18");
        //if-else-if statement
        int t = 2;
        if (t==1)
        System.out.println("t is 1");
        else if(t==4)
            System.out.println("t is 4");
        else if(t==6)
            System.out.println("t is 6 ");
        else
            System.out.println("t is not present");
        // switch case statement
        switch (8) {
            case 1:
                System.out.println("monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
//                break;
            case 7:
                System.out.println("sunday");
                break;
                default:System.out.println("invalid");





        }


    }
}
