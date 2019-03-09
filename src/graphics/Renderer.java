package graphics;

import graphics.displays.GamePanel;
import graphics.displays.MainMenuPanel;
import input.Keyboard;
import main.Main;
import util.Util;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Klausmp
 */

public class Renderer extends JFrame {
    public static BufferedImage bild;
    public static int windowSizeX;
    public static int windowSizeY;
    public static JFrame window = new JFrame();
    public static List<JPanel> panelList = new ArrayList<JPanel>();
    public static GamePanel gamePanel = new GamePanel();

    public Renderer() {
        loadTextures();
        /*Configurations*/

        //Windowsize ETC
        resizeWindow(400, 400);

        //Window
        getWindow().setTitle(Main.gameTitle);
        getWindow().setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        getWindow().setLocationRelativeTo(null);
        getWindow().setResizable(false);
        getWindow().setLayout(new BorderLayout());
        getWindow().add(getGamePanel(), BorderLayout.CENTER);
        getWindow().addKeyListener(new Keyboard());
        getWindow().setVisible(true);

        /*Buttons*/

    }

    public static void resizeWindow(int wight, int height) {
        if (Util.getScreenSize().getWidth() == 1360 && Util.getScreenSize().getHeight() == 768) {
            wight = (wight + 2) - 10;
            height = (height + 2) + 12;
        }

        if (Util.getScreenSize().getWidth() == 1920 && Util.getScreenSize().getHeight() == 1080) {
            wight = (wight + 2);
            height = (height + 2) + 23;
        }

        if (Util.getScreenSize().getWidth() == 1280 && Util.getScreenSize().getHeight() == 720) {
            wight = (wight + 2);
            height = (height + 2) + 23;
        }
        //getGamePanel().getScreen().setBounds(0, 0, wight, height);
        getWindow().setSize(wight, height);
        setWindowSizeX(wight);
        setWindowSizeY(height);
    }

    public static void loadTextures() {
        try {
            bild = ImageIO.read(Renderer.class.getClassLoader().getResourceAsStream("gfx/alien1_0.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static BufferedImage getBild() {
        return bild;
    }

    public static void setBild(BufferedImage bild) {
        Renderer.bild = bild;
    }

    public static int getWindowSizeX() {
        return windowSizeX;
    }

    public static void setWindowSizeX(int windowSizeX) {
        Renderer.windowSizeX = windowSizeX;
    }

    public static int getWindowSizeY() {
        return windowSizeY;
    }

    public static void setWindowSizeY(int windowSizeY) {
        Renderer.windowSizeY = windowSizeY;
    }

    public static JFrame getWindow() {
        return window;
    }

    public static void setWindow(JFrame window) {
        Renderer.window = window;
    }

    public static List<JPanel> getPanelList() {
        return panelList;
    }

    public static void setPanelList(List<JPanel> panelList) {
        Renderer.panelList = panelList;
    }

    public static GamePanel getGamePanel() {
        return gamePanel;
    }

    public static void setGamePanel(GamePanel gamePanel) {
        Renderer.gamePanel = gamePanel;
    }

    @Override
    public String toString() {
        return "Renderer{" +
                "rootPane=" + rootPane +
                ", rootPaneCheckingEnabled=" + rootPaneCheckingEnabled +
                ", accessibleContext=" + accessibleContext +
                ", accessibleContext=" + accessibleContext +
                '}';
    }
}