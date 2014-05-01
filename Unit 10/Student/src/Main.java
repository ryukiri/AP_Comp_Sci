import java.util.ArrayList;

public class Main {
    public static void main(String args[]){
        Senior s1 = new Senior("Siufpuqs", 1234, 2.3, true);
        Senior s2 = new Senior("Sswife", 1235, 1.6, true);
        Junior j1 = new Junior("Jfqawiuhfe", 1342, 4.4);
        Junior j2 = new Junior("Juofeaw", 4123, 4.6);
        
        j1.setSatScore(1201);
        j2.setSatScore(2314);
        
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(((Student)s1));
        students.add(s2);
        students.add(j1);
        students.add(j2);
        
        for(Student s: students)
            System.out.println(s.getName() + " is a " + s.getYear());
    }
}
