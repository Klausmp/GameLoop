package graphics.displays;

import util.Util;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public static Screen screen = new Screen();

    public GamePanel() {
        screen.setBounds(0, 0, 400, 400);
        screen.setVisible(true);
        setLayout(new BorderLayout());
        add(screen, BorderLayout.CENTER);
    }

    static class Screen extends JLabel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBackground(g);
            drawGame(g);
        }
        public void drawBackground(Graphics g) {
            Util.drawBackground(g, new Color(13, 13, 13));
        }
        public void drawGame(Graphics g) {
        }
    }

    public static void updateScreen() {
        screen.repaint();
    }

}
