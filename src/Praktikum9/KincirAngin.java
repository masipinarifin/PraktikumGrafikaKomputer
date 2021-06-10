/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum9;

/**
 *
 * @NURUL ARIFIN 19MI0016
 */
import java.awt.*;
import java.awt.geom.GeneralPath;
import java.util.logging.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class KincirAngin extends JPanel implements Runnable{
    private int x = 0;
    int x2 = 255;
    int x3 = 255;
    Thread th = new Thread(this);
    public KincirAngin(){
        setPreferredSize(new Dimension(350, 300));
        th.start();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        GradientPaint wp = new GradientPaint(150, 0, Color.blue, 200, 0, Color.black);
        if (x < 256){
            x2 = x;
        }
        GradientPaint wl = new GradientPaint(0,0, new Color(0 + x2, 255 - x2, 255-x2), 0, 100, new Color(255, 255, 255 - x2));
        GradientPaint wt = new GradientPaint(0, 200, Color.GREEN, 0, 250, new Color(0, 0, 0));
        g2.setPaint(wl);
        g2.fillRect(0, 0, 350, 300);
        g2.setPaint(wt);
        g2.fillRect(0, 200, 350, 100);
        g2.setPaint(wp);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(150, 150);
        gp.lineTo(200, 150);
        gp.lineTo(210, 270);
        gp.lineTo(140, 270);
        gp.closePath();
        g2.fill(gp);
        g2.setColor(Color.WHITE);
        g2.draw(gp);
        gamTri(g, x);
        gamTri(g, x + 90);
        gamTri(g, x + 180);
        gamTri(g, x + 270);
        g2.setColor(Color.white);
        g2.fillOval(171, 171, 10, 10);
    }
    private void gamTri(Graphics g, int angle){
        g.setColor(new Color(0, 0, 0));
        g.fillArc(100, 100, 150, 150, angle, 30);
    }
    public void run(){
        while(true){
            this.x = x + 1;
            try{
                repaint();
                Thread.sleep(10);
            }catch (InterruptedException ex){
                Logger.getLogger(KincirAngin.class.getName());
            }
        }
    }
    public static void main(String[] args) {
        JFrame fra = new JFrame();
        JPanel pa = new KincirAngin();
        fra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fra.getContentPane().add(pa);
        fra.pack();
        fra.setVisible(true);
    }
}
