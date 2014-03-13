/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package board.game.jftha;


public class Priest extends Hero{
    
    //Constructor
    public Priest(){
        this.setMP(super.getMP() + 10);
        this.setHP(super.getHP() - 10);
    }
    
}
