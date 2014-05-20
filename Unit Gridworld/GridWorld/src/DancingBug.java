import info.gridworld.actor.Bug;

public class DancingBug extends Bug {
    private int[] turns;
    private int steps;
    
    public DancingBug(int x[]){
        turns = x;
        steps = 0;
    }
    
    public void turn(int times){
        for(int i=0; i<times; i++){
            super.turn();
        }
    }
    
    public void act(){
        turn(turns[steps%turns.length]);
        steps++;
        super.act();
    }
}
