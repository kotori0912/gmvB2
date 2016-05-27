import java.awt.Container;

import javax.swing.JFrame;

public class GameFrame extends JFrame {
    public GameFrame() {
        setTitle("Javaゲーム");
        setResizable(false);
        GamePanel gp = new GamePanel();
        Container contentPane = getContentPane();
        contentPane.add(gp);
        pack();
    }

    public static void main(String args[]) {
        GameFrame gf = new GameFrame();
        gf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gf.setVisible(true);
    }
}
