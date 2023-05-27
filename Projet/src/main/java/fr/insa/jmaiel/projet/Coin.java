/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fr.insa.jmaiel.projet;
public class Coin {
    //Attributs
    private static int idCounter = 0;
    private int idCoin;
    private double cx;
    private double cy;
    
    //Constructeurs
    public Coin(double cx, double cy) {
        this.idCoin = idCounter++;
        this.cx = cx;
        this.cy = cy;
    }

     @Override
    public String toString() {
        return "Coin"+ idCoin +"(cx : " + cx +" cy: " + cy +")\n";
    }
    
    //Getters utiles
    public double getCx() {
        return cx;
    }

    public double getCy() {
        return cy;
    }

    public static void setIdCounter(int idCounter) {
        Coin.idCounter = idCounter;
    }

    public void setIdCoin(int idCoin) {
        this.idCoin = idCoin;
    }

    public void setCx(double cx) {
        this.cx = cx;
    }

    public void setCy(double cy) {
        this.cy = cy;
    }
    
    
}
