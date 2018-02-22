package clone;

/**
 * Created by sunlei on 22/02/2018.
 */
public class main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student();
        student.setClassNo(111);
        student.setName("s1");
        student.setNo(12);
        Student student1=(Student) student.clone();
        student.setNo(22);
        System.out.println(student);
        System.out.println(student1);
        System.out.println(student1==student);
    }
}
