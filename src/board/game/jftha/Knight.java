package board.game.jftha;

public class Knight extends Hero{
    
    //Constructor
    public Knight(){
        this.setDefense(super.getDefense() + 2);
        this.setAgility(super.getAgility() - 2);
    }
}
