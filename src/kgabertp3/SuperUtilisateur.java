/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgabertp3;

/**
 *
 * @author raphaeltribouilloy
 */
public class SuperUtilisateur extends Utilisateur {
    
    private int droits[] = new int[3];

    public SuperUtilisateur(String pseudo, String centreInteret, int droits[]){
        super(pseudo,centreInteret);
        this.droits = droits;
    }

    public int[] getDroits() {
        return droits;
    }

    public void setDroits(int[] droits) {
        this.droits = droits;
    }

    
    
}
