package clone;

/**
 * Created by sunlei on 22/02/2018.
 */
public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student();
        student.setClassNo(111);
        student.setName("s1");
        student.setNo(12);
        Teacher t1 = new Teacher();
        t1.setNo(1);
        t1.setName("sl1");
        t1.setStudent(student);
        Teacher t2= (Teacher) t1.clone();
        t2.getNo();
        t2.getStudent().setName("s2");
        while(true) {
            System.out.println(t1.getNo() + ":" + t1.getName() + ":" + t1.getStudent());
            System.out.println(t2.getNo() + ":" + t2.getName() + ":" + t2.getStudent());
        }
    }
}
