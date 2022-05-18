package Students;
import java.util.List;
import java.util.ArrayList;

public class StudentsMain {
    public static void main(String[] args) {
        Student std1 = new Student();
        std1.setSno(1);
        std1.setSname("blueBerry");
        std1.setGrade("B");

        Student std2 = new Student();
        std2.setSno(2);
        std2.setSname("blackberry");
        std2.setGrade("A");

        Student std3 = new Student();
        std3.setSno(3);
        std3.setSname("redBerry");
        std3.setGrade("O+");

        List<Student> list = new ArrayList<>();
        list.add(std1);
        list.add(std2);
        list.add(std3);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getGrade().equals("A")) {
                System.out.println("grade with A  " + list.get(i).getSname());
            }
        }
    }
}










