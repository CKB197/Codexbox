package OOPs;

public class MethodOverloading {
   void singer(String name2){
      System.out.println("I'm singing song : kuch Baatein  ");
   }
   void singer(int rank){
      System.out.println(" ranked " +rank+ " position in India");
   }
   void singer(String name1 , String name) {
      System.out.println("He is " + name1 + " He is " + name);
   }
}
