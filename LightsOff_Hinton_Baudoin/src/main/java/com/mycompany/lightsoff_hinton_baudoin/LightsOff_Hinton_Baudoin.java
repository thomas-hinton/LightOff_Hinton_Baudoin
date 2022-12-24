/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lightsoff_hinton_baudoin;

/**
 *
 * @Créated by Mr Baudoin et Mr Hinton
 */
public class LightsOff_Hinton_Baudoin {
    public static void main(String[] args) {
        PlateauDeJeu jeu = new PlateauDeJeu();
        jeu.afficherGrilleSurConsole() ;
        jeu.switchlight(0, 0);
        jeu.switchlight(1, 0);
        jeu.switchlight(4, 0);
        jeu.afficherGrilleSurConsole() ;
    }
}
