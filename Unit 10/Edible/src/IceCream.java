public class IceCream implements Edible, RefrigeratorItem{
    private int calories;
    private String name;
    
    public IceCream(String n , int c){
        name = n;
        calories = c;
    }
    
    @Override
    public String getFoodGroup(){
        return "Dairy";
    }
    
    @Override
    public int getCalories(){
        return calories;
    }
    
    @Override
    public int getExpiration(){
        return 1423;
    }
    
    @Override
    public boolean isFrozen(){
        return true;
    }
}
