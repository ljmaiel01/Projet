/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

/**
 *
 * @author Jika
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public abstract class Batiment {
    //Attribut 
    private static int idCounter = 0; //joue le role de numerator
    private int idBatiment;
    private int nbNiveau;
    ArrayList<Niveau> niveaux;

    //Constructeurs
    public Batiment(int idBatiment, int nbNiveau, ArrayList<Niveau> niveaux) {
        this.idBatiment = idCounter++;
        this.nbNiveau = nbNiveau;
        this.niveaux = niveaux;
    }

    @Override
    public String toString() {
        return "Batiment " + idBatiment +"(  nbNiveaux " + nbNiveau +" )\n";
    }


    //Methode pour calculer le devis d'un Batiment
    public double devisBatiment(){
        double montant =0;
        for(Niveau niveau : niveaux){       //Sommes des devis des niveau du batiment
            montant += niveau.devisNiveau();
        }
        return montant;
    }
    
    public void sauvegarder(){
        String cheminFichier = "Batiment.txt";
        String contenu = this.toString();
        try {
            // Créez un objet FileWriter en spécifiant le fichier à écrire
            FileWriter fichierWriter = new FileWriter(cheminFichier);

            // Écrivez le contenu dans le fichier
            try ( // Créez un objet BufferedWriter pour écrire dans le fichier
                    BufferedWriter bufferedWriter = new BufferedWriter(fichierWriter)) {
                // Écrivez le contenu dans le fichier
                bufferedWriter.write(contenu);
                // Fermez le BufferedWriter
            }

            System.out.println("Le contenu a été écrit dans le fichier avec succès.");
        } catch (IOException e) {
            System.out.println("Une erreur s'est produite lors de l'écriture dans le fichier : " + e.getMessage());
        }

    }//fin sauvegarder
 
}//fin class Batiment
