/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;


import java.util.ArrayList;

public class Maison extends  Batiment{
    //Attributs
    private static int idCounter = 0;
    private  int idMaison;
    private ArrayList<Piece> pieces;

    //Constructeurs
    public Maison(int idBatiment, int nbNiveau, ArrayList<Niveau> niveaux, ArrayList<Piece> pieces) {
        super(idBatiment, nbNiveau, niveaux);
        this.idMaison = idCounter++;
        this.pieces = pieces;
    }

    //Pour affichage et sauvegarde 
    @Override
    public String toString() {

        String textPiece = "";
        for (Piece piece : pieces) textPiece +=  "\t " + piece.toString() +"\n";

        return super.toString()
                + "Maison" + idMaison + "\n"
                + "\t pieces : \n " +
                "\t" + textPiece;
    }

    //Méthode pour calculer la surface d'une maison
    public double surface(){
        double surface = 0;
        for(Piece piece : pieces){              //Somme des surfaces des sols (Anaogue à appartement)
            surface += piece.getSol().surface();
        }
        return surface;
    }

    //Méthode pour calculer le devis d'une maison
    @Override
    public double devisBatiment() {
        double montant = 0;
        for(Piece piece : pieces){          //Somme des devis des pièces de la maison 
            montant += piece.devisPiece();
        }
        return montant;
    }
    
}
