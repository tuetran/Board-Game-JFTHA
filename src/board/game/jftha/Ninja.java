package board.game.jftha;

public class Ninja extends Hero{
    
    //Constructor
    public Ninja(){
        this.setAgility(super.getAgility() + 2);
        this.setDefense(super.getDefense() - 2);
    }
}
