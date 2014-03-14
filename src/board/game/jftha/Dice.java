package board.game.jftha;

import java.util.*;

public class Dice {
    int roll;
    
    //Constructor
    public Dice(){
        Random rand = new Random();
        this.roll = rand.nextInt(4) + 1; // rand.nextInt(4) is random from 0 - 3. + 1 ensure it can be 1- 4
    }
    
    protected int getRoll(){
        return roll;
    }
    
}
