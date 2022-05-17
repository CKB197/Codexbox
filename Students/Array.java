package Students;

public class Array {
    public static void main(String[] args) {
       /* int[] arr = new int [] {1,2,3,4,7,5};
        for (int i=0; i< arr.length;i++){
            System.out.println(arr[i]);*/


        int arr[] = new int[5];  // allocating memory for 5 integers
        arr[0] = 10;  //initialize 1st element of array
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i = 0; i < arr.length; i++)
            System.out.println("element at index" + i + " : " + arr[i]);
    }
}





