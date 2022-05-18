public class SumofTwoNos {
    float num = 2.6f;//instance variable
    static int count = 60;

    public static void main(String[] args) {
        int a = 3, b = 6, sum; //These variables are local to the main method only
        sum = a + b;
        System.out.println("sum of two nos. local variable :" + sum);
        SumofTwoNos obj = new SumofTwoNos();
        System.out.println("Instance variable:" + obj.num);
        System.out.println("Static variable : " + count);
    }
}

