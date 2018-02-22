package clone;

/**
 * Created by sunlei on 22/02/2018.
 */
public class Student implements Cloneable {
    private String name;
    private int classNo;
    private int no;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getClassNo() {
        return classNo;
    }

    public void setClassNo(int classNo) {
        this.classNo = classNo;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;

        Student student = (Student) o;

        if (getClassNo() != student.getClassNo()) return false;
        if (getNo() != student.getNo()) return false;
        return getName() != null ? getName().equals(student.getName()) : student.getName() == null;
    }

    @Override
    public int hashCode() {
        int result = getName() != null ? getName().hashCode() : 0;
        result = 31 * result + getClassNo();
        result = 31 * result + getNo();
        return result;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classNo=" + classNo +
                ", no=" + no +
                '}';
    }
}
