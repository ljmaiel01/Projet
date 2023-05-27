/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

import java.util.ArrayList;

public class Niveau {
    //Attributs
    private static int idCounter = 0;
    private int idNiveau;
    private ArrayList<Appartement> apparts;

    //Constructeurs
    public Niveau(ArrayList<Appartement> apparts) {
        this.idNiveau = idCounter++;
        this.apparts = new ArrayList<>();
    }
    
    //Pour affichage et sauvegarde 
    @Override
    public String toString() {

        String textAppartement = "";
        for (Appartement appart : apparts) textAppartement +=  "\t " + appart.toString() +"\n";

        return super.toString()
                + "Niveau " + idNiveau + "\n"
                + "\t appartements : \n " +
                "\t" + textAppartement;
    }

    //Méthode pour calculer le devis d'un niveau qlq
    public double devisNiveau(){
        double montant = 0;
        for(Appartement appart : apparts){      //Somme des devis d'appartement du niveau en question
            montant += appart.devisAppartement();
        }
        return montant;
    }
}
