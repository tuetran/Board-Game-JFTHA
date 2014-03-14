package board.game.jftha;

public class Thief extends Hero{

    //Constructor
    public Thief(){
        this.setLuck(super.getLuck() + 2);
    }
}
