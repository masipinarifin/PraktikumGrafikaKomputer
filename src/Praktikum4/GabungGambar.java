package Praktikum4;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import javax.swing.JFrame;
import javax.swing.JPanel;
public class GabungGambar extends JPanel{
    private static final long serialVersionUID = 1L;
    public void gambar(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        double x1[] = {200, 300, 250};
        double y1[] = {100, 150, 300};
        double x2[] = {100, 300, 250};
        double y2[] = {300, 100, 200};
        GeneralPath p1 = new GeneralPath();
        p1.moveTo(x1[0], y1[0]); //Titik acuan
        //Segitiga 1
        for(int i = 1; i < x1.length; i++){
            p1.lineTo(x1[i], y1[i]);
        }
        p1.lineTo(x1[0], y1[0]);
        GeneralPath p2 = new GeneralPath();
        p2.moveTo(x2[0], y2[0]); // titik acuan 
        //Segitiga 2
        for(int i = 1; i < x1.length; i++){
            p2.lineTo(x2[i], y2[i]);
        }
        p2.lineTo(x2[0], y2[0]);
        Area a1 = new Area(p1); //Area dari segitiga 1
        Area a2 = new Area(p2); //Area dari segitiga 2
        a1.add(a2); //Menggabungkan area 2 ke area 1
        g2d.setColor(Color.cyan);
        g2d.fill(a1);
    }
    public void paintComponent(Graphics g){
        clear (g);
        gambar (g);        
    }
    protected void clear(Graphics g){
        super.paintComponent(g);
    }
    public static void main(String[] args){
        GabungGambar panelGambar = new GabungGambar();
        JFrame frameGambar = new JFrame("Gambar Polyline");
        frameGambar.setSize(400, 400);
        panelGambar.setBackground(Color.WHITE);
        frameGambar.setContentPane(panelGambar);
        frameGambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGambar.setVisible(true);
    }
}
