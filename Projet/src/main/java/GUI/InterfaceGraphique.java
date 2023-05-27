/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;


import java.util.Optional;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

public class InterfaceGraphique extends Application {

    // Méthode permettant le démarrage de l'interface graphique
    public static void demarrage() {
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        
        

        /*
        // Création des éléments
        BorderPane borderpane = new BorderPane();
        
        MenuBar menuBar = new MenuBar();
        VBox VBox = new VBox();
        Canvas canvas = new Canvas(600,800);
        HBox HBox = new HBox();

        // Création des menus
        Menu menu1 = new Menu("Fichier");
        Menu menu2 = new Menu("Creation");

        // Création des éléments de menu
        MenuItem menuItem1 = new MenuItem("Nouveau");
        MenuItem menuItem2 = new MenuItem("Ouvrir");
        MenuItem menuItem3 = new MenuItem("Enregistrer");
        MenuItem menuItem4 = new MenuItem("Enregistrer sous");
        MenuItem menu2Item1 = new MenuItem("Coin");

        // Ajout des éléments de menu aux menus
        menu1.getItems().addAll(menuItem1, menuItem2, menuItem3, menuItem4);
        menu2.getItems().add(menu2Item1);

        // Ajout des menus à la barre de menu
        menuBar.getMenus().addAll(menu1, menu2);

        
        
        
        

        
        
       

        
        
        borderpane.setTop(menuBar); //on met la barre de menu en haut de la scene
        borderpane.setCenter(canvas);
        borderpane.setRight(VBox);
        borderpane.setBottom(HBox);
        







        */

        // Configuration de la scène
        Scene scene = new Scene(new MainPane());


        // Affichage de la scène
        primaryStage.setScene(scene);
        primaryStage.setTitle("ProjetDevisBatiment");
        primaryStage.show();

        
        
    }//fin start

}//fin classe




/*
Stage:
    .setTitle(" ")
    .setScene(scene)
    .show()
    .setMinWidth(value)
    .setMinHeight(value)
    
Scene:
    



Un Label permet d'afficher un texte non éditable

liste des Layout Panes:
    HBox et VBox donne des rectangles horizontaux et verticaux
    StackPane donne un carré
*/