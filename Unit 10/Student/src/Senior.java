public class Senior extends Student {
    private boolean offCampusPass;
    private boolean isLegal;
    
    public Senior(String name, int iD, double gpa, boolean legal){
        super(name, iD, gpa);
        isLegal = legal;
        offCampusPass = false;
    }
    
    public void changePassStatus(){
        offCampusPass = !offCampusPass;
    }
    
    @Override
    public String getYear(){
        return "Senior";
    }
}
