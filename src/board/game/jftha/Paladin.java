/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;


public class Paladin extends Hero{
   
    //Constructor
    public Paladin(){
        this.setStrength(super.getStrength() + 5);
        this.setMagic(super.getMagic() + 5);
        this.setDefense(super.getDefense() + 5);
        this.setLuck(super.getLuck() +5);
        this.setHP(super.getHP() + 20);
        this.setMP(super.getMP() + 10);
        this.setSpellSlots(super.getSpellSlots() + 1);
    }
    
}
