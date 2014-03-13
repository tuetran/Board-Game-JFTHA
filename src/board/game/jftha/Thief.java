
package board.game.jftha;

/**
 *
 * @author Tue
 */
public class Thief extends Hero{

    //Constructor
    public Thief(){
        this.setLuck(super.getLuck() + 2);
    }
}
