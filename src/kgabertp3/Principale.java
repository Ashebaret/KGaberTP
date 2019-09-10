/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kgabertp3;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
        
        Utilisateur utilisateur1 = new Utilisateur("Raphael","D");
        Utilisateur utilisateur2 = new Utilisateur("Joel","Informatique");
        Utilisateur utilisateur3 = new Utilisateur("Amy","Informatique");
        Utilisateur utilisateur4 = new Utilisateur("Micka","Ianformatique");
        
        utilisateur1.ajouterUnAmis(utilisateur2);
        utilisateur1.ajouterUnAmis(utilisateur3);
        utilisateur1.ajouterUnAmis(utilisateur4);
        
        System.out.print("Mon Id : ");
        System.out.println(utilisateur1.getId());
        
        System.out.print("Mon pseudo : ");
        System.out.println(utilisateur1.getPseudo());
        
        System.out.print("Mes ami(e)s : ");
        utilisateur1.getListeAmis().forEach(amis -> System.out.print(amis.getPseudo() + " / "));
        System.out.println();
        
        //Test du trie par centre d'intéret OK 
        Collections.sort(utilisateur1.getListeAmis(),(ami1, ami2)->ami1.getCentreInteret().concat(ami1.getPseudo()).compareTo(ami2.getCentreInteret().concat(ami2.getPseudo())));
        utilisateur1.getListeAmis().forEach(amis -> System.out.print(amis.getPseudo() + " / "));
        
        
       
    }
    
}
