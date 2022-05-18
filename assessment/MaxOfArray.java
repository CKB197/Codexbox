package assessment;

public class MaxOfArray {
    public static void main(String[] args) {
        int  [] x= new int[]{10,15,20,25,30};
            int i;
            int max = x[0];
            for (i = 1; i< x.length; i++) {
                if (x[i] > max)
                max = x[i];
            }
                System.out.println("maximum value of array " +max);
            }
        }



