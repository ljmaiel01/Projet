/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

import java.util.ArrayList;

public class Immeuble extends Batiment {
    //Attributs
    private int idImmeuble;
    private static int idCounter = 0;
    private ArrayList<Appartement> apparts;

    //Constructeurs
    public Immeuble(int idBatiment, int nbNiveau, ArrayList<Niveau> niveaux,ArrayList<Appartement> apparts, int idImmeuble) {
        super(idBatiment, nbNiveau, niveaux);
        this.idImmeuble = idCounter++;
    }
    
     //Pour affichage et sauvegarde 
    @Override
    public String toString() {

        String textNiveau = "";
        for (Niveau niveau : niveaux) textNiveau +=  "\t " + niveau.toString() +"\n";

        return super.toString()
                + "Immeuble " + idImmeuble + "\n"
                + "\t niveaux : \n " +
                "\t" + textNiveau;
    }
    
    //Méthode pour calculer la surface d'un immeuble
    public double surface(){
        double surface = 0;
        for(Appartement appart : apparts){              //Somme des surfaces des sols
            surface += appart.surface();
        }
        return surface;
    }

    //Méthode pour calculer le devis d'une maison
    @Override
    public double devisBatiment() {
        double montant = 0;
        for(Appartement appart : apparts){          //Somme des devis des pièces de la maison 
            montant += appart.devisAppartement();
        }
        return montant;
    }
}