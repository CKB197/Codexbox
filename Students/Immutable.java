package Students;

public class Immutable {
    public static void main(String[] args) {
  StringBuffer sb = new StringBuffer("I am from");
  String s=new String(" Jharkhand");
  sb.append(s);
//  System.out.println(sb);
 String replaceString = sb.toString().replace("from","in");
      System.out.println(sb);
      System.out.println(replaceString);

      StringBuilder sb1 = new StringBuilder("I'm in  Jharkhand");
      sb1.insert(7,"Bokaro Steel City,;");
        System.out.println(sb1);

        sb1=sb1.delete(25,26);
        System.out.println(sb1);

        sb1=sb1.replace(6,7," Chas, ");
        System.out.println(sb1);

       sb1.reverse();
        System.out.println(sb1);
    }
}
