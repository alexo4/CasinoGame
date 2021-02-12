
package casinogame;

import java.awt.Color;
import java.awt.Toolkit;
import java.util.ArrayList;


public class CasinoGame {
    
    
    
    public static void main(String[] args) {
        
        loginPage game = new loginPage();
        
        Toolkit tk = Toolkit.getDefaultToolkit();
        
        int xSize = (int)tk.getScreenSize().getWidth();
        int ySize = (int)tk.getScreenSize().getHeight();
        game.setSize(xSize,ySize);
        game.getContentPane().setBackground(Color.decode("#05F9ED"));
        
        game.setVisible(true);
    }
    
}
