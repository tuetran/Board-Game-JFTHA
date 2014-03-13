/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;

public class Ninja extends Hero{
    
    //Constructor
    public Ninja(){
        this.setAgility(super.getAgility() + 2);
        this.setDefense(super.getDefense() - 2);
    }
}
