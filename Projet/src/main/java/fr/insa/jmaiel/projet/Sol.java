/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

import fr.insa.jmaiel.projet.Revetement;
import java.util.ArrayList;

public class Sol {
    //Attributs
    private static int idCounter = 0;
    private int idSol;
    private ArrayList<Coin> coins;
    private ArrayList<Revetement> revetements;

    //Constructeurs
    public Sol( ArrayList<Coin> coins, ArrayList<Revetement> revetements) {
        this.idSol = idCounter++;
        this.coins = coins;
        this.revetements = revetements;
    }

    @Override
    public String toString() {
        String textCoins = "";
        for(Coin coin : coins){
            textCoins += "\t\t\t\t\t" +coin.toString();
        }
        return "Sol" + idSol +"( surface: "+surface()+", devis: "+montantRevetement()+"):\n"
                +"\t\t\t\t" + "Coins: \n"
                + textCoins;
    }

    //Méthode pour calculer la surface du sol (Analogue à plafond
    public double surface(){
        double longueur = Math.sqrt(Math.pow(coins.get(1).getCx() - coins.get(0).getCx(),2)+Math.pow(coins.get(1).getCy()- coins.get(0).getCy(),2));
        double largeur = Math.sqrt(Math.pow(coins.get(2).getCx() - coins.get(1).getCx(),2)+Math.pow(coins.get(2).getCy()- coins.get(1).getCy(),2));;

        return longueur*largeur;

    }

    //Méthode pour calculer le cout en revetement du sol
    public double montantRevetement(){
        double montant = 0;
        for(Revetement revetement : revetements){
            if(revetement.isPourSol()) montant += revetement.getPrixUnitaire()*surface();
        }
        return montant;
    }
}
