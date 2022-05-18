public class Operators {
    public static void main(String[] args) {
        //Arithmetic operator
        int num1 = 10;
        int num2 = 2;
        System.out.println("addition=" + (num1 + num2));
        System.out.println("difference=" + (num1 - num2));
        System.out.println("multiplication=" + (num1 * num2));
        System.out.println("division=" + (num1 / num2));
        System.out.println("modular division=" + (num1 % num2));
                     //unary operator
        num1 = -num1;
        System.out.println("unary value is:" + num1);
        //assignment operator
        num2=num1;
        System.out.println("assigned value is:"+num2);
        //relational operator
        int num3=10,num4=2;
        System.out.println("using == operator value is " +(num3==num4));
        System.out.println("using Not equal to operator value is "+(num3!=num4));
        System.out.println("using greater than operator value is "+(num3>num4));
        System.out.println("using less than operator value is "+(num3<num4));
        System.out.println("using greater than equal to operator value is "+(num3>=num4));
        System.out.println("using less than equal to operator value is "+(num3<=num4));
        // logical operator
        int num5=6, num6=7, num7=8;
        System.out.println((num5>num6)&&(num6==num7));
        System.out.println((num6<num7)||(num5>num7));
        System.out.println(!(num5>num6));
        // ternary operator
        int num;
        num=(num7<num6)?num7:num6;
        System.out.println("max value is :"+num);

    }


}


