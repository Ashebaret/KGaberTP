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
public class Principale {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Utilisateur utilisateur1 = new Utilisateur("Raphael","Aucun");
        Utilisateur utilisateur2 = new Utilisateur("Joel","Aucun");
        Utilisateur utilisateur3 = new Utilisateur("Amy","Aucun");
        Utilisateur utilisateur4 = new Utilisateur("Micka","Aucun");
        
        utilisateur1.ajouterUnAmis(utilisateur2);
        utilisateur1.ajouterUnAmis(utilisateur3);
        utilisateur1.ajouterUnAmis(utilisateur4);
        
        System.out.print("Mon Id : ");
        System.out.println(utilisateur1.getId());
        
        System.out.print("Mon pseudo : ");
        System.out.println(utilisateur1.getPseudo());
        
        System.out.print("Mes ami(e)s : ");
        utilisateur1.getListeAmis().forEach(amis -> System.out.print(amis.getPseudo() + " / "));
        
       
    }
    
}
