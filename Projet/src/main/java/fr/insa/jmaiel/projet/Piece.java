/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

import java.util.ArrayList;

public class Piece {
    //Attributs
    private static int idCounter = 0;
    private int idPiece;
    private ArrayList<Mur> murs;
    private Sol sol ;
    private Plafond plafond ;

    //Constructeurs
    public Piece(ArrayList<Mur> murs, Sol sol, Plafond plafond) {
        this.idPiece = idCounter++;
        this.murs = murs;
        this.sol = sol;
        this.plafond = plafond;
    }

    //Méthode pour calculer le devis d'une pièce
    public double devisPiece(){
        double montant = sol.montantRevetement() + plafond.montantRevetement();
        for(Mur mur : murs) montant += mur.montantRevetement();
        return montant;
    }

    //Méthode pour calculer la surface d'une pièce
    public double surface(){
        double surface = sol.surface() + plafond.surface();
        for(Mur mur : murs) surface += mur.surface();
        return surface;
    }

    //Pour affichage et sauvegarde 
   @Override
    public String toString() {
        String textMur = "";
        for(Mur mur : murs){
            textMur += "\t\t\t\t" +mur.toString() + "\n";
        }

        return  "Piece" + idPiece +"(surface: "+surface()+", devis: "+devisPiece()+ "):\n"
                +"\t\t\t" + sol.toString() + "\n"
                +"\t\t\t" + plafond.toString() + "\n"
                +"\t\t\t Murs : \n" + textMur;
    }

    //getters utiles
    public Sol getSol() {
        return sol;
    }

    public void dessiner(){
        // TO DO
    }
}