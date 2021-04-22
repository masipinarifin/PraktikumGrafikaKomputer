package PraktikumGrafika;

// @author nurularifin 19MI0016

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.Stroke;
import java.awt.geom.Rectangle2D;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

public class Praktikum1 extends JFrame{
    public Praktikum1() {
    super("Rectangles Drawing Demo");
        
        getContentPane().setBackground(Color.WHITE);
        setSize(482, 260);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }
    void drawRectangles(Graphics g){
        Graphics2D g2d = (Graphics2D) g;
        //Perintah menggambarnya ditulis di sini
        
        //Tugas01
        //g2d.drawRect(30, 50, 420, 120); 
        
        //Tugas02
        //g2d.drawRoundRect(30, 50, 420, 120, 20, 20);
        
        //Tugas03
        //g2d.setColor(Color.ORANGE);
        //g2d.draw3DRect(WIDTH, WIDTH, WIDTH, WIDTH, rootPaneCheckingEnabled);
        //g2d.draw3DRect(30, 50, 420, 120, true);
        
        //Tugas04
        //Stroke stroke1 = new BasicStroke(6f);
        //g2d.setColor(Color.BLUE);
        //g2d.setStroke(stroke1);
        //g2d.drawRect(30, 50, 420, 120);
        
        //Tugas05
        /*
        int x = 20;
        int y = 40;
        int width = 440;
        int height = 140;
        Stroke stroke1 = new BasicStroke(6f);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(stroke1);
        g2d.drawRect(x, y, width, height);
        float[] dashingPattern1 = {2f, 2f};
        Stroke stroke2 = new BasicStroke(2f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 0.0f);
        g2d.setColor(Color.RED);
        g2d.setStroke(stroke2);
        g2d.drawRect(x + 20, y + 20, width - 40, height - 40);
        float[] dashingPattern2 = {10f, 4f};
        Stroke stroke3 = new BasicStroke(4f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dashingPattern2, 0.0f);
        g2d.setColor(Color.GREEN);
        g2d.setStroke(stroke3);
        g2d.drawRect(x + 40, y + 40, width - 80, height - 80);
        float[] dashingPattern3 = {10f, 10f, 1f, 10f};
        Stroke stroke4 = new BasicStroke(4f, BasicStroke.CAP_SQUARE, BasicStroke.JOIN_MITER, 1.0f, dashingPattern3, 0.0f);
        g2d.setColor(Color.BLUE);
        g2d.setStroke(stroke4);
        g2d.drawRect(x + 60, y + 60, width - 120, height - 120);
         */
        
        //Tugas06
        g2d.setColor(Color.ORANGE);
        g2d.fillRect(0, 0, 482, 260);
        
        g2d.setColor(Color.green);
        g2d.fillRect(30, 50, 422, 190);
        
        Stroke stroke1 = new BasicStroke(3f);
        g2d.setColor(Color.WHITE);
        g2d.setStroke(stroke1);
        g2d.drawRect(55, 50, 372, 190);
        g2d.drawRect(30, 65, 422, 160);
        g2d.drawRect(30, 50, 149, 95);
        g2d.drawRect(30, 145, 149, 95);
        g2d.drawRect(303, 50, 149, 95);
        g2d.drawRect(303, 145, 149, 95);
        
        float[] dashingPattern1 = {10f, 6f};
        Stroke stroke2 = new BasicStroke(3f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 1.0f, dashingPattern1, 0.0f);
        g2d.setColor(Color.WHITE);
        g2d.setStroke(stroke2);
        g2d.drawRect(179, 50, 62, 190);
    }
    public void paint(Graphics g){
        super.paint(g);
        drawRectangles(g);
    }
    public static void main(String[] args) throws Exception{
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run(){
                new Praktikum1().setVisible(true);
            }
        });
        
    }
    
}
