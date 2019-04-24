package graphics.displays;

import graphics.Window;
import input.Mouse;
import input.MouseMotion;
import util.Util;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class GamePanel extends JPanel {
    public static Screen screen = new Screen();
    //list of worlds if used
    //public static List<World> worldList = new ArrayList<World>();

    public GamePanel() {
        screen.setVisible(true);
        setLayout(new BorderLayout());
        add(screen, BorderLayout.CENTER);
        addMouseListener(new Mouse());
        addMouseMotionListener(new MouseMotion());
        //worldList.add(new World(26, 36, 8, 8, 10));
    }

    public static void update() {


    }
    /* get world frrom list
    public static World getWorld() {
        for (World world : getWorldList()) {
            return world;
        }
        System.out.println("ERROR: KEINE WOLRD VORHANDEN (GamePanel.getWolrd)");
        return null;
    }*/

    public static boolean isGameStarted(){
        return false;
    }

    public void setScreenBounds(int wight, int height) {
        getScreen().setBounds(0, 0, wight, height);
    }

    public static void updateScreen() {
        screen.repaint();
    }

    public static class Screen extends JLabel {
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            drawBackground(g);
            drawGame(g);
        }

        public void drawBackground(Graphics g) {
            Util.drawBackground(g, new Color(26, 38, 42, 255));
        }

        public void drawGame(Graphics g) {

        }
    }

    public static Screen getScreen() {
        return screen;
    }

    public static void setScreen(Screen screen) {
        GamePanel.screen = screen;
    }
}
