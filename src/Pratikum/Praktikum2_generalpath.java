package Pratikum;

/**
 *
 * @author nurul arifin 19MI0016
 */







import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class Praktikum2_generalpath extends JPanel {
    public void gambar(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setColor(Color.orange);
            GeneralPath gp = new GeneralPath();
            gp.moveTo(60, 120);
            gp.lineTo(80, 120);
            gp.quadTo(90, 140, 100, 120);
            gp.lineTo(160, 120);
            gp.quadTo(170, 140, 180, 120);
            gp.lineTo(200, 120);
            gp.curveTo(195, 100, 200, 80, 160, 80);
            gp.lineTo(110, 80);
            gp.lineTo(90, 100);
            gp.lineTo(60, 100);
            gp.lineTo(60, 120);
            g2d.draw(gp);
    }
    
@Override
public void paintComponent(Graphics g){
    clear(g);
    gambar(g);
}
protected void clear(Graphics g){
    super.paintComponent(g);
}
public static void main(String[] args){
    Praktikum2_generalpath panelGambar = new Praktikum2_generalpath();
    JFrame frameGambar = new JFrame("Gambar Mobil");
        frameGambar.setSize(400, 400);
    panelGambar.setBackground(Color.white);
        frameGambar.setContentPane(panelGambar);
    frameGambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameGambar.setVisible(true);
}
    
}