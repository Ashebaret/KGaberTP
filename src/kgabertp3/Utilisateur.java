/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgabertp3;


import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author raphaeltribouilloy
 */
public class Utilisateur {
    
    private static int compteur = 0;
    private int id;
    private String pseudo, centreInteret;
    private ArrayList<Utilisateur> listeAmis;
    private Date dateinsciption;
    
    public Utilisateur(String pseudo, String centreInteret){
    
        compteur = compteur + 1;
        this.id = compteur;
        this.pseudo = pseudo;
        this.centreInteret = centreInteret;
        this.dateinsciption = new Date();
        listeAmis = new ArrayList<Utilisateur>();
    }

    public void setPseudo(String pseudo) {
        this.pseudo = pseudo;
    }

    public void setCentreInteret(String centreInteret) {
        this.centreInteret = centreInteret;
    }

    public void setListeAmis(ArrayList<Utilisateur> listeAmis) {
        this.listeAmis = listeAmis;
    }
    
    public void ajouterUnAmis(Utilisateur monAmis){
        this.listeAmis.add(monAmis);
    }

    public static int getCompteur() {
        return compteur;
    }

    public int getId() {
        return id;
    }

    public String getPseudo() {
        return pseudo;
    }

    public String getCentreInteret() {
        return centreInteret;
    }

    public ArrayList<Utilisateur> getListeAmis() {
        return listeAmis;
    }

    public Date getDateinsciption() {
        return dateinsciption;
    }
    /*
    @Override
    public int compareTo(Utilisateur autre){
        return new CompareToBuilder()
                .append(getCentreInteret(), autre.getCentreInteret())
                .append(getPseudo(), autre.getPseudo())
                .toComparison();
    }
    */
    
}
