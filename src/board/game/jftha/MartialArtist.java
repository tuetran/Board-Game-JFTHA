/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;


public class MartialArtist extends Hero{
    
    //Constructor
    public MartialArtist(){
        this.setStrength(super.getStrength() + 2);
        this.setAgility(super.getAgility() + 2);
        this.setHP(super.getHP() + 10);
        this.setMP(super.getMP() + 10);
    }
    
}
