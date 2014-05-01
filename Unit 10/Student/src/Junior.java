public class Junior extends Student {
    private int satScore;
    
    public Junior(String name, int iD, double gpa){
        super(name, iD, gpa);
        satScore = 0;
    }
    
    public void setSatScore(int n){
        satScore = n;
    }
    
    @Override
    public String getYear(){
        return "Junior";
    }
}
