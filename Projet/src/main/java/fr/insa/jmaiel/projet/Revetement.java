/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;

public class Revetement {
    //Attributs
    private  int idRevetement;
    private String designation;
    private boolean pourMur;
    private boolean pourSol;
    private boolean pourPlafond;
    private double prixUnitaire;

    /*public double montantTotalRevetement(){
        return 0;
    }*/ 

    //Constructeurs
    public Revetement(int idRevetement, String designation, boolean pourMur, boolean pourSol, boolean pourPlafond, double prixUnitaire) {
        this.idRevetement = idRevetement++;
        this.designation = designation;
        this.pourMur = pourMur;
        this.pourSol = pourSol;
        this.pourPlafond = pourPlafond;
        this.prixUnitaire = prixUnitaire;
    }
    
    //Getters 
    
    public boolean isPourMur() {
        return pourMur;
    }

    public boolean isPourSol() {
        return pourSol;
    }

    public boolean isPourPlafond() {
        return pourPlafond;
    }

    public double getPrixUnitaire() {
        return prixUnitaire;
    }
    public int getIdRevetement() {
        return idRevetement;
    }
}

