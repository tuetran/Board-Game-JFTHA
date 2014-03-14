package board.game.jftha;

public class Barbarian extends Hero{
    
    //Constructor
    public Barbarian(){
        this.setStrength(super.getStrength() + 2);
        this.setMagic(super.getMagic() - 2);
    }
}

