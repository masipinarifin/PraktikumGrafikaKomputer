package Praktikum6;

/**
 *
 * @NURUL ARIFIN
 *
 */




import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.geom.Point2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KaptenJerry extends JApplet {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Captain Jerry");;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new KaptenJerry();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new RainPanel();
        getContentPane().add(panel);
    }
}

