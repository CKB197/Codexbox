package HelloWorld;

import javax.imageio.stream.ImageInputStream;

// Elements of the array are objects of a class Student.
public class Example {
    public int roll_no;
    public String name;

    Example(int roll_no, String name) {
        this.roll_no = roll_no;
        this.name = name;

        }



         public static void main(String[] args){
        // declares an Array of integers.
        Example[] arr;

        // allocating memory for 5 objects of type Student.
        arr = new Example[5];

        // initialize the first elements of the array
        arr[0] = new Example(1,"aman");

        // initialize the second elements of the array
        arr[1] = new Example(2,"vaibhav");

        // so on...
        arr[2] = new Example(3,"shikar");
        arr[3] = new Example(4,"dharmesh");
        arr[4] = new Example(5,"mohit");

        // accessing the elements of the specified array
        for (int i = 0; i < arr.length; i++)
            System.out.println("Element at " + i + " : " +
                    arr[i].roll_no +" "+ arr[i].name);
    }
}

