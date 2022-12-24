/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lightsoff_hinton_baudoin;

import java.util.Random;

/**
 *
 * @Créated by Mr Baudoin et Mr Hinton
 */
//Définition de la classe "PlateauDeJeu" 
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
     * Méthode permettant de changer l'état d'une cellule et de toute ses voisines limitrophes
     * @param x ligne de la grille (type : int)
     * @param y colonne de la grille (type : int)
     */
    public void switchlight_all(int x, int y){
        grille[x][y].switchlight();
        //teste si la cellule au dessu existe : si oui switchlight la cellule 
        if (x-1 >= 0){
            grille[x-1][y].switchlight();
        }
        //teste si la cellule en dessous existe : si oui switchlight la cellule
        if (x+1 <= 4){
            grille[x+1][y].switchlight();
        }
        //teste si la cellule a gauche existe : si oui switchlight la cellule
        if (y-1 >=0){
            grille[x][y-1].switchlight();
        }
        //teste si la cellule a droite existe : si oui switchlight la cellule
        if (y+1 <= 4){
            grille[x][y+1].switchlight();
        } 
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
    
    /**
     * Méthode permettant d'initialiser une grille de jeu pour une partie (change de manière aléatoire l'état des cellules de la grille : "true" )
     */
    public void initialiser_PlateauDeJeu_pour_parties(){
        Random aleat = new Random() ;                            //Création d'un nouvel objet de type "Random"
        for (int i=0; i < 5; i++) {               
            for (int j=0; j < 5; j++) {
                if (aleat.nextInt(0, 2) == 1){          //Teste une églitée générée de manière aléatoire
                    grille[i][j].switchlight();                   //Permet de changer l'état d'une cellule de la grille de manière aléatoire
                }
            }                                                                            
        }
    }
    
    /**
     * Méthode permettant de renvoyer si la grille est gagante ou pas
     * @return true / false (type : boolean) gagante / pas gagante
     */
    public boolean grille_gagnante(){
        for (int i=0; i < 5; i++) {               
            for (int j=0; j < 5; j++) {
                if (grille[i][j].lireCellule() == true){
                    return false ;
                }
            }
        }
        return true ;
    }
}
