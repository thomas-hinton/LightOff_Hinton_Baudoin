/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lightsoff_hinton_baudoin;

/**
 *
 * @Créated by Mr Baudoin et Mr Hinton
 */
//Définition de la classe "CelluleDeGrille" 
public class CelluleDeGrille {
    private boolean lumiere_allumee ;
    
    /**
     *Constructeur d'objet de type "CelluleDeGrille"
     */
    public CelluleDeGrille() {
        lumiere_allumee = false;
    }
    
    /**
    * Méthode permettant de lire une cellule de grille et renvoyer si la lumière y est allumée ou pas
    * @return lumiere_allumee (type : boolean) renvoie si la case possede sa lumière allumée (true/false)
    */        
    boolean lireCellule(){
        return lumiere_allumee ;
    }
    
    /**
     * Méthode permettant de allummer / éteindre une cellule
     */
    public void switchlight(){
        if (lumiere_allumee == true) {
           lumiere_allumee = false ; 
        }
        else{
            lumiere_allumee = true ;
        }
    }
    
    /**
     * Méthode "toString()" qui permet de renvoyer l'état de la cellule : éteinte / allumée
     * @return true/false (type : str)
     */
    @Override
    public String toString() {      
        String chaine_a_retourner ;
        if (lumiere_allumee == true){            //Teste si la lumière est allumée ou éteinte
            chaine_a_retourner = "O" ;          //Signifie ON
        }
        else{
            chaine_a_retourner = "." ;          //Signifie OFF
        }
        return chaine_a_retourner ;
    }    
}
