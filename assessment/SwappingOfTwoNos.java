package assessment;

public class SwappingOfTwoNos {
    public static void main(String[] args) {
        int i= 10, j=25;

        System.out.println("before swapping values of..."+i+" "+j);
        i = i+j;
        j = i-j;
        i = i -j;
        System.out.println("after swapping values of..."+i+" "+j);
    }
}
