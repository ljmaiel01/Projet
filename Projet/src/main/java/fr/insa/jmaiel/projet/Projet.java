/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package fr.insa.jmaiel.projet;

import GUI.InterfaceGraphique;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Jika
 */
public class Projet {
    public static void main(String[] args) {
        System.out.println("Entrez l'hauteur sous plafond du niveau en création"); //Demander l'hsp du niveau à l'utlisateur
        double hauteurSousPlafond=Lire.d(); //lire l'hauteur sousplafond

        ArrayList<Niveau> niveaux = new ArrayList<>();
        ArrayList<Piece> pieces = new ArrayList<>();
        ArrayList<Mur> murs = new ArrayList<>();
        ArrayList<Coin> coins = new ArrayList<>();
        ArrayList<Revetement> cataloguerevetements = new ArrayList<>();
        ArrayList<Revetement> revetements = new ArrayList<>();


        CatalogueRevetements(cataloguerevetements);
        
        revetements.add(cataloguerevetements.get(0));//peinture
        revetements.add(cataloguerevetements.get(4));//crepi


        Coin c1 = new Coin(0,2);
        Coin c2 = new Coin(0,0);
        Coin c3 = new Coin(2,2);
        Coin c4 = new Coin(2,0);

        coins.add(c1);
        coins.add(c2);
        coins.add(c3);
        coins.add(c4);


        Mur m1 = new Mur(c1,c2,1,0,revetements);
        Mur m2 = new Mur(c2,c3,0,1,revetements);
        Mur m3 = new Mur(c3,c4,0,0,revetements);
        Mur m4 = new Mur(c4,c1,0,0,revetements);

        murs.add(m1);
        murs.add(m2);
        murs.add(m3);
        murs.add(m4);

        Sol s1 = new Sol(coins,revetements);
        Plafond pl1 = new Plafond(coins,revetements);



        Piece p1 = new Piece(murs,s1,pl1);
        pieces.add(p1);





        Maison m = new Maison(0,2,niveaux,pieces);

        m.sauvegarder();
        InterfaceGraphique.demarrage();
        
    }//fin main

    public static void CatalogueRevetements(ArrayList<Revetement> ListRevetementFichierText){
        //Debut de la lecture du fichier texte Revetement

        //Declaration de la liste contenant les infos du fichier texte et des File and BufferedReader
        FileReader fr = null;
        BufferedReader readrevetement = null;
        try {
            fr = new FileReader("revetements.txt");       //création du FileReader
            readrevetement = new BufferedReader(fr);          //création du BufferedReader
            String line;                                         //contient tous les caractères d'une ligne entière
            while ((line = readrevetement.readLine()) != null) { //tant que la ligne lue n'est pas vide:
                String[] data = line.split(";");//séparer les chaines de caractères lorsqu'il y a un ";" et les placer dans un tableau
                //Les infos des revetements dans le fichier texte contiennent, dans l'ordre:
                int idRevetement = Integer.parseInt(data[0]);    //l'ID
                String designation = data[1];                    //la désignation (peinture, carrelage,...)
                boolean pourMur = Boolean.parseBoolean(data[2]); //si oui ou non c'est un revetement pour les murs
                boolean pourSol = Boolean.parseBoolean(data[3]); //si oui ou non c'est un revetement pour les sols
                boolean pourPlafond = Boolean.parseBoolean(data[4]);//si oui ou non c'est un revetement pour les plafonds
                double prixUnitaire = Double.parseDouble(data[5]);//le prix au m²
                //Ces infos sont stockées directement dans des instances de la classe Revetement
                Revetement revetement = new Revetement(idRevetement, designation, pourMur, pourSol, pourPlafond, prixUnitaire);//instanciation de l'objet contenant les infos désirées
                ListRevetementFichierText.add(revetement); //Ajout de l'instance dans la liste de Revetement
            }
        } catch (FileNotFoundException err) {
            System.out.println("Erreur : le fichier n'existe pas!\n " + err);
        } catch (IOException err) {
            System.out.println("Erreur :\n " + err);
        } finally { //quand la lecture du fichier est terminée:
            try {
                if (readrevetement != null) {//si le BufferedReader contient encore des éléments, alors:
                    readrevetement.close(); //fermer le flux, pour économiser de la mémoire
                }
                if (fr != null) { //si le FileReader contient encore des éléments, alors:
                    fr.close();   //fermer le flux, pour économiser de la mémoire
                }
            } catch (IOException err) {
                System.out.println("Erreur lors de la fermeture des ressources :\n " + err);
            }
        }
    }//fin CatalogueRevetements 
}//fin class principale



   