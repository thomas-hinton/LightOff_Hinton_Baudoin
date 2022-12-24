/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lightsoff_hinton_baudoin;

import java.util.Scanner;

/**
 *
 * @Créated by Mr Baudoin et Mr Hinton
 */
//Définition de la classe "Parties" 
public class Parties {
    private PlateauDeJeu plateau ;
    private int coups_joues ;
    
    /**
     * Constructeur d'objets de type "Parties"
     */
    public Parties(){
        plateau = new PlateauDeJeu() ;
        plateau.initialiser_PlateauDeJeu_pour_parties();            //initialise le plateau pour partie
        coups_joues = 0 ;
    }
    
    /**
     * Méthode qui permet de jouer une cellule
     */
    public void jouer_Cellule(){
        coups_joues += 1 ;
        Scanner sc1 = new Scanner(System.in) ; 
        Scanner sc2 = new Scanner(System.in) ;
        System.out.println("Quelle ligne souhaitez vous jouer? (0 à 4 compris)");
        int ligne = sc1.nextInt();
        System.out.println("Quelle colonne souhaitez vous jouer? (0 à 4 compris)");
        int colonne = sc2.nextInt();
        plateau.switchlight_all(ligne, colonne);
    } 
}
