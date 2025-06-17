import java.awt.Dimension;

import javax.swing.*;

public class gameFrame extends JFrame {

    gameFrame() {
        gamePanel panel = new gamePanel(); 
        this.add(panel);
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setPreferredSize(new Dimension(800, 800));
        this.pack();

    }
}
