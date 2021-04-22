package Pratikum;

/**
 *
 * @author nurul arifin 19MI0016
 */





import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
public class Praktikum2_lines extends JPanel{
    public void paint(Graphics g)
    {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        Stroke stroke = new BasicStroke(8, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        Stroke old_stroke = g2d.getStroke();
        g2d.setStroke(stroke);
        g2d.drawLine(10,70,70,10);
        g2d.drawString("Pakai drawLine", 10, 90);
        
        g2d.translate(150,0); //pindah titik penggambaran
        
        Line2D.Double line = new Line2D.Double(10,70,70,10);
        g2d.draw(line);
        g2d.drawString("pakai Line2D shape",10,90);
        
        g2d.translate(-150, 150); //pindah titik penggambaran
        
        GeneralPath p = new GeneralPath();
        p.append(line, false);
        g2d.draw(p);
        g2d.drawString("pakai GeneralPath",10,90);
        
        g2d.translate(150, 0); //pindah titik penggambaran
        
        g2d.setStroke(old_stroke);
        g2d.draw(stroke.createStrokedShape(line));
        g2d.drawString("pakai StrokedShape",10,90);
    }
    public static void main(String args[])
    {
        JFrame frame = new JFrame("Graphics2D Lines");
        JPanel panel = new Praktikum2_lines();
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
