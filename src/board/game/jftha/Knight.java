/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;


public class Knight extends Hero{
    
    //Constructor
    public Knight(){
        this.setDefense(super.getDefense() + 2);
        this.setAgility(super.getAgility() - 2);
    }
}
