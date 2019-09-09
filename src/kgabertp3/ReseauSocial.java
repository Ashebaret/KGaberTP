/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgabertp3;

import java.util.ArrayList;

/**
 *
 * @author raphaeltribouilloy
 */
public class ReseauSocial {
    
    private ArrayList<Utilisateur> lesUtilisateurs;
    private ArrayList<SuperUtilisateur> lesSuperUtilisateurs;
    
    public ReseauSocial(){
        this.lesUtilisateurs = new ArrayList<Utilisateur>();
        this.lesSuperUtilisateurs = new ArrayList<SuperUtilisateur>();
    }
    
    public void ajouterUtilisateur(Utilisateur leUtilisateur){
        this.lesUtilisateurs.add(leUtilisateur);
    }
    
    public void ajouterSuperUtilisateur(SuperUtilisateur leSuperUtilisateur){
        this.lesSuperUtilisateurs.add(leSuperUtilisateur);
    }

    public ArrayList<Utilisateur> afficherListeUtilisateur(){
        return this.lesUtilisateurs;
    }
    
    public ArrayList<SuperUtilisateur> afficherListeSuperUtilisateur(){
        return this.lesSuperUtilisateurs;
    }
    
}
