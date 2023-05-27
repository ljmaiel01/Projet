/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

/**
 *
 * @author Jika
 */
import java.util.ArrayList;

public class Appartement {
    //Attributs
    private static int idCounter = 0;
    private int idAppartement;
    private ArrayList<Piece> pieces;
    
    //Constructeurs
    public Appartement(int idAppartement) {
        this.idAppartement = idCounter++;
        this.pieces = new ArrayList();
    }

    //Pour affichage et sauvegarde
     @Override
    public String toString() {

        String textPiece = "";
        for (Piece piece : pieces) textPiece +=  "\t " + piece.toString() +"\n";

        return super.toString()
                + "Appartement" + idAppartement + "\n"
                + "\t pieces : \n " +
                "\t" + textPiece;
    }

    //Méthode pour calculer le devis de l'appartement
    public double devisAppartement(){
        double montant = 0;
        for(Piece piece : pieces){          //Somme des devis des pièces de l'appartement
            montant += piece.devisPiece();
        }
        return montant;
    }

    //Méthode pour calculer la surface de l'appartement 
    public double surface(){
        double surface = 0;
        for(Piece piece : pieces){              //Somme des surfaces des sols 
            surface += piece.getSol().surface();
        }
        return surface;
    }

    public void dessiner(){
        //TO DO
    }
}
