package Praktikum6;

/**
 *
 * @NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Container;
import java.awt.RenderingHints;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class AntialiasON extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
                RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setColor(Color.black);
        g2.fillOval(10, 10, 200, 200);
        g2.setColor(Color.white);
        g2.fillOval(80, 40, 100, 100);
        g2.setFont(new Font("Tahoma", Font.BOLD, 64));
        g2.setColor(Color.black);
        g2.drawString("8", 112, 110);
    }    
    public static void main(String args[]){
        JFrame frame = new JFrame("Dengan Antialising");
        JPanel panel = new AntialiasON();
        frame.setSize(425, 250);
        Container c = frame.getContentPane();
        c.add(panel);
        frame.show();
        frame.addWindowListener(
        new WindowAdapter(){
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
    }
}