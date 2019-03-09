package util;

import graphics.Renderer;

import java.awt.*;

/**
 * @author Klausmp
 */

public class Util {
    //Erkennung der Displayauflösung
    public static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
    //Liste in der die Welt gespeichert wird

    //Screen Layer für den Hintergrund (hinterste Ebene)
    public static void drawBackground(Graphics g, Color color) {
        //Setung der Farbe für den Hintergrunf
        g.setColor(color);
        //Zeichnung eines Rechhteckes am Rand des Fensters
        g.drawRect(0, 0, Renderer.getWindowSizeX(), Renderer.getWindowSizeY());
        //Zeichnet so viele Lienien vom oberene bis zum unteren ende des Bildes (in der Größe des Fensters)
        for (int i = 0; i <= Renderer.getWindowSizeX(); i++) {
            g.drawLine(i, 0, i, Renderer.getWindowSizeY());
        }
    }

    //Entfernung aller Listenelemente und somit Löschung aller Entitys
    public static void clearLists() {

    }

    public static Dimension getScreenSize() {
        return screenSize;
    }

    public static void setScreenSize(Dimension screenSize) {
        Util.screenSize = screenSize;
    }

}
