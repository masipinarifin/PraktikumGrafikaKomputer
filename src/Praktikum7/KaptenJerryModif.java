package Praktikum7;

/**
 *
 * @NURUL ARIFIN
 * 19MI0016
 *
 */
import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Point2D;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class KaptenJerryModif extends JApplet {

    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Captain Jerry Modif");;
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new KaptenJerryModif();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
    }

    public void init() {
        JPanel panel = new RainPanelModif();
        getContentPane().add(panel);
    }
}
class RainPanelModif extends JPanel implements Runnable{
    Point2D.Double[] pts = new Point2D.Double[1200];
    public RainPanelModif(){
        setPreferredSize(new Dimension(1400, 750));
        //set background(Color.blue)
        for(int i = 0; i < pts.length; i++){
            pts[i] = new Point2D.Double(Math.random(), Math.random());
        }
        Thread thread = new Thread(this);
        thread.start();
    }
    public void paintComponent (Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        super.paintComponent(g);
        setBackground (new Color(214, 214, 214));
        for(int i = 0; i < pts.length; i++){
            int x = (int) (1400*pts[i].x);
            int y = (int) (480*pts[i].y);
            int h = (int) (25*Math.random());
            g.drawLine(x, y, x, y+h);
        }
        g2.setStroke(new BasicStroke(3.0f));
        //tembok
        g2.setColor(Color.gray);
        g2.fillRect(0, 0, 500, 500);
        g2.fillRect(1100, 0, 1100, 1400);
        //hijau
        g2.setColor(Color.green);
        g2.fillRect(0, 0, 500, 100);
        g2.fillRect(1100, 0, 1100, 100);
        //garis tengah
        g2.setColor(Color.black);
        g2.drawLine(0, 100, 500, 100);
        g2.drawLine(1100, 100, 1400, 100);
        //korden
        g2.setColor(new Color(85, 43, 0));
        g2.drawLine(760, 0, 760, 500);
        g2.drawLine(800, 0, 800, 500);
        g2.drawLine(840, 0, 840, 500);
        g2.fillOval(500, -100, 200, 200);
        g2.fillOval(675, -25, 100, 100);
        g2.fillOval(750, -50, 100, 100);
        g2.fillOval(825, -25, 100, 100);
        g2.fillOval(900, -100, 200, 200);
        //garis
        g2.setColor(Color.black);
        g2.drawOval(500, -100, 200, 200);
        //g2.drawOval(675, -25, 100, 100);
        g2.drawOval(750, -50, 100, 100);
        //g2.drawOval(825, -25, 100, 100);
        g2.drawOval(900, -100, 200, 200);
        //jendela
        g2.setColor(Color.BLACK);
        g2.fillRect(500, 0, 600, 20);
        g2.fillRect(500, 0, 25, 500);
        g2.fillRect(1075, 0, 25, 500);
        g2.drawLine(498, 0, 498, 500);
        g2.drawLine(1100, 0, 1100, 500);
        //garis hitam
        g2.setColor(Color.black);
        g2.fillRect(0, 430, 1400, 70);
        g2.setColor(new Color(249, 124, 0));
        g2.fillRect(0, 500, 1400, 750);
        //jerry
        g2.setColor(Color.black);
        g2.fillOval(250, 80, 200, 200);
        g2.fillOval(550, 80, 210, 210);
        g2.setColor(Color.black);
        g2.fillOval(630, 315, 40, 40);
        g2.setColor(Color.darkGray);
        g2.fillOval(610, 300, 50, 70);
        g2.setColor(Color.black);
        g2.fillOval(350, 180, 300, 300);
        g2.setColor(Color.black);
        g2.fillOval(515, 430, 150, 220);
        g2.setColor(Color.blue);
        g2.fillOval(565, 460, 100, 100);
        g2.setColor(Color.black);
        g2.fillOval(530, 600, 100, 150);
        g2.setColor(Color.blue);
        g2.fillOval(515, 600, 110, 100);
        g2.setColor(Color.blue);
        g2.fillOval(350, 600, 100, 100);
        g2.setColor(Color.black);
        g2.fillOval(350, 600, 100, 150);
        g2.setColor(new Color(220, 0, 0));
        g2.fillOval(250, 320, 400, 400);
        g2.setColor(Color.black);
        g2.drawOval(250, 320, 400, 400);
        g2.setColor(new Color(0, 0, 160));
        g2.fillOval(280, 370, 300, 300);
        g2.setColor(new Color(220, 0, 0));
        g2.fillRect(380, 480, 90, 40);
        g2.setColor(Color.white);
        g2.fillRect(380, 520, 90, 40);
    }
    public void run(){
        while(true){
            for(int i = 0; i < pts.length; i++){
                double x = pts[i].getX();
                double y = pts[i].getY();
                y += 0.1 * Math.random();
                if(y > 1){
                    y = 0.3 * Math.random();
                    x = Math.random();
                }
                pts[i].setLocation(x, y);
            }
            repaint();
            try{
                Thread.sleep(100);
            }
            catch (InterruptedException ex){
                
            }
        }
    }
}