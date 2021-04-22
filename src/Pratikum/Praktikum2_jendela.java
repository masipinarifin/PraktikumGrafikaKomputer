package Pratikum;

/**
 *
 * @author nurul arifin 19MI0016
 */

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;

public class Praktikum2_jendela extends JPanel{
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        /*
        Stroke stroke = new BasicStroke(1, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        Stroke old_stroke = g2d.getStroke();
        g2d.setStroke(stroke);
        g2d.drawLine(10,70,70,10);
        */
        g2d.drawString("Hello",50,40);
        
        Line2D.Double line = new Line2D.Double(70,50,230,50);
        GeneralPath p = new GeneralPath();
        p.append(line, false);
        g2d.draw(p);
        
        Line2D.Double line2 = new Line2D.Double(230,50,230,230);
        GeneralPath p2 = new GeneralPath();
        p2.append(line2, false);
        g2d.draw(p2);
        
        Line2D.Double line3 = new Line2D.Double(70,230,230,230);
        GeneralPath p3 = new GeneralPath();
        p3.append(line3, false);
        g2d.draw(p3);
        
        Line2D.Double line4 = new Line2D.Double(70,230,70,50);
        GeneralPath p4 = new GeneralPath();
        p4.append(line4, false);
        g2d.draw(p4);
        
        Line2D.Double line5 = new Line2D.Double(70,140,230,140);
        GeneralPath p5 = new GeneralPath();
        p5.append(line5, false);
        g2d.draw(p5);
        
        Line2D.Double line6 = new Line2D.Double(150, 50, 150, 230);
        GeneralPath p6 = new GeneralPath();
        p6.append(line6, false);
        g2d.draw(p6);
    }
    
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Gsmbar Jendela");
        JPanel panel = new Praktikum2_jendela();
        frame.setSize(300,300);
        Container c = frame.getContentPane();
        panel.setBackground(Color.white);
        c.add(panel);
        frame.show();
        frame.addWindowListener(
            new WindowAdapter() {
       public void windowClosing(WindowEvent e)
       {
           System.exit(0);
       }
            }
        );
    }    
}
