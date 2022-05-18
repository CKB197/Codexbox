package Students;

public class ImmutableMain {
    public static void main(String[] args) {
        ImmutableString immutableString = new ImmutableString("Chandan",151080110490L,"B+",80.00f);
        System.out.println(immutableString.getName());
        System.out.println(immutableString.getBlood_group());
        System.out.println(immutableString.getReg_no());
        System.out.println(immutableString.getPercentage());
    }
}
