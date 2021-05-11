package Praktikum6;

/**
 *
 * @NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Container;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JPanel;
import javax.swing.JFrame;
public class Antialias extends JPanel{
    public void paintComponent (Graphics g){
        super.paintComponent(g);
        g.setColor(Color.black);
        g.fillOval(10, 10, 200, 200);
        g.setColor(Color.white);
        g.fillOval(80, 40, 100, 100);
        g.setFont(new Font("Tahoma", Font.BOLD, 64));
        g.setColor(Color.black);
        g.drawString("8", 112, 110);
    }    
    public static void main(String args[]){
        JFrame frame = new JFrame("Tanpa Antialising");
        JPanel panel = new Antialias();
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