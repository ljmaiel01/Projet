package GUI;

import javafx.scene.canvas.Canvas;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Flo
 */
public class MainPane extends BorderPane{
    
    private RadioButton rbSelect;
    private RadioButton rbCoin;
    private RadioButton rbMur;
    private Button bPiece;
    
    private DessinCanvas cDessin;
    
    public MainPane(){
        this.rbSelect = new RadioButton("Select");
        this.rbCoin = new RadioButton("Coin");
        this.rbMur = new RadioButton("Mur");
        
        VBox vbGauche = new VBox(this.rbSelect, this.rbCoin, this.rbMur);
        this.setLeft(vbGauche);
        
        this.bPiece = new Button("Piece");
        
        this.cDessin = new DessinCanvas(200,200);
        this.setCenter(this.cDessin);
    }
    
}
