package ui;

import javax.swing.* ;
import java.awt.*;

public class DrawingApp extends JFrame {

    public DrawingApp() {
        super("Labyrinthe") ; // Window title



        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE) ; // Explicit !

        pack() ;            // Components sizes and positions
        setVisible(true) ;  // The great show
    }

}