/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

import java.util.ArrayList;

public class Mur {
    //Attributs
    private static int idCounter = 0;
    private int idMur;
    private Coin debut;
    private Coin fin;
    private int nbPorte;
    private int nbFenetre;
    private ArrayList<Revetement> revetements;

    //Constructeurs
    public Mur(Coin debut, Coin fin, int nbPorte, int nbFenetre, ArrayList<Revetement> revetements) {
        this.idMur = idCounter++; //incrémentation auto
        this.debut = debut;
        this.fin = fin;
        this.nbPorte = nbPorte;
        this.nbFenetre = nbFenetre;
        this.revetements= revetements;
    }

    @Override
    public String toString() {

        return "Mur" + idMur +" (nbPorte : "+ nbPorte +", nbFenetre :"+ nbFenetre +", surface: "+surface()+", devis "+montantRevetement()+")\n"
                +"\t\t\t\t " + "Debut : " + debut.toString()
                +"\t\t\t\t " + "Fin : " + fin.toString() + "\n";
    }

    //Méthode pour calculer la surface d'un mur
    public double surface(){
        double hauteurSousPlafond=2;
        double largeur = Math.sqrt(Math.pow(debut.getCx() - fin.getCx(),2)+Math.pow(debut.getCy()-fin.getCy(),2));
        double surfaceOuverture = nbFenetre * Fenetre.surface() + nbPorte * Porte.surface();
        return (hauteurSousPlafond * largeur) - surfaceOuverture;

    }

    //Méthode pour calculer le cout en revetement du mur 
    public double montantRevetement(){
        double montant = 0;
        for(Revetement revetement : revetements){
            if(revetement.isPourMur()) montant += revetement.getPrixUnitaire()*surface();
        }
        return montant;
    }
}