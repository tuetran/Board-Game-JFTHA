/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;


public class Merchant extends Hero{
    
    //Constructor
    public Merchant(){
        this.setStorageSpace(super.getStorageSpace() + 3);
        this.setStrength(super.getStrength() - 2);
        this.setAgility(super.getAgility() + 2);
        this.setMagic(super.getMagic() - 5);
        this.setDefense(super.getDefense() - 2);
        this.setLuck(super.getLuck() + 5);
    }
    
}
