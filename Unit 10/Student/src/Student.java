public abstract class Student {
    private String name;
    private int iD;
    private double gpa;
    
    public Student(String n, int i, double g){
        name = n;
        iD = i;
        gpa = g;
    }
    
    public String getName(){
        return name;
    }
    
    public int getiD(){
        return iD;
    }
    
    public double getGPA(){
        return gpa;
    }
    
    public abstract String getYear();
    
}
