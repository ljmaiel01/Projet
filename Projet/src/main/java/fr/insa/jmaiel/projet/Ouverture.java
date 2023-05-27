/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;
/**
 *
 * @author ljmaiel01
 */
public class Ouverture {
    //Attributs
    int idOuverture;
    double dimX;
    double dimY;
    
    //Constructeurs
    public Ouverture(int idOuverture, double dimX, double dimY) {
        this.idOuverture = idOuverture;
        this.dimX = dimX;
        this.dimY = dimY;       
    }
    
    void afficher(){
        System.out.println("Ouverture: id= "+ this.idOuverture + " abcisse= "+ this.dimX + " ordonnée= " + this.dimY);
    }

    @Override
    public String toString() {
        return "Ouverture{" + "idOuverture=" + idOuverture + ", dimX=" + dimX + ", dimY=" + dimY + '}';
    }
    
     public double surface() {
    return dimX * dimY;
     }
}
    
   
