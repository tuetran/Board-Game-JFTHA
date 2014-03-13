/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;


public class Mage extends Hero{
    
    //Constructor
    public Mage(){
        this.setMagic(super.getMagic() + 2);
        this.setStrength(super.getStrength() - 2);
        this.setDefense(super.getDefense() - 3);
        this.setSpellSlots(super.getSpellSlots() + 2);
    }
}
