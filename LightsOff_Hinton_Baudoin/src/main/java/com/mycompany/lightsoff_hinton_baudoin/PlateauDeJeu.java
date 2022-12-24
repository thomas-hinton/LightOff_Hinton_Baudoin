/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lightsoff_hinton_baudoin;

/**
 *
 * @Créated by Mr Baudoin et Mr Hinton
 */
public class PlateauDeJeu {
    CelluleDeGrille[][] grille = new CelluleDeGrille[5][5] ;
    
    /**
     * Constructeur d'objetc de type "PlateauDeJeu"
     */
    public PlateauDeJeu() {
        for (int i=0; i < 5; i++) {                      //Parcours toute les lignes
            for (int j=0; j < 5; j++) {                  //Parcours toute les colonnes
                grille[i][j] = new CelluleDeGrille() ;   //Crée un nouvel objet de type "cellule" dans chaque cases du tableau
            }
        }  
    }
    
    /**
     * Méthode permettant de lire l'état d'une cellule de la grille de ligne x et de colonne y
     * @param x ligne de la grille (type : int)
     * @param y colonne de la grille (type : int)
     * @return true/false (type : boolean) cellule allumée/éteinte
     */
    public boolean lireCelluleDeGrille(int x, int y){
        return grille[x][y].lireCellule() ;
    }
    
    /**
     * Méthode permettant de changer l'état d'une cellule (On/Off) de la grille de ligne x et de colonne y
     * @param x ligne de la grille (type : int)
     * @param y colonne de la grille (type : int)
     */
    public void switchlight(int x,int y){
        grille[x][y].switchlight();
    }
    
    /**
     * Méthode permettant de afficher dans la consolle la grille de jeu
     */
    public void afficherGrilleSurConsole(){
        String grilleaffichage ="";                                           //Variable locale permettant de faciliter l'affichage de chaque lignes(incrémentée)
        for (int i=0; i < 5; i++) {               
            for (int j=0; j < 5; j++) {
                grilleaffichage = grilleaffichage + "|" + grille[i][j] ;      //ecriture de la première ligne  
            }
            grilleaffichage += "|" +"\n" ;                                    //Permet de fermer la grille de manière esthétique et de retourner à la ligne                          
        }
        System.out.println(grilleaffichage) ;
    }
    
    
    
    
    
    
    
    
    
    
}
