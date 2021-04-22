package PraktikumGrafika;

//@author nurularifin 19MI0016

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GambarSegiTiga extends JPanel {
    
    private static long serialVersionUID = 1L;
    
    public void gambar(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        //{titikStartBawah, TitikPuncak, titikEndBawah}
        int x[] = {50, 200, 350}; // jika diberlakukan di titik x maka berhubungan dengan jarak horizontalnya
        int y[] = {300, 50, 300}; // jika diberlakukan di titik y maka berhubungan dengan ketinggiannya
        g2d.draw(new Polygon(x,y,x.length));
    }
    /*Override adalah teknologi yang memungkinkan class turunan atau subclass atau kadang juga disebut child,
     di mana subclass atau child ini bisa mengubah variabel yang ada di parentclass (parent/induk).
     Mengubah di sini bisa berarti menggantikan perintah, membuat perintah baru, mengembangkan perintah,
     dan memodifikasi perintah. 
      
    */
    @Override
    public void paintComponent(Graphics g) {
        clear(g);
        gambar(g);
    }
    
    protected void clear(Graphics g){
        super.paintComponent(g);
    }
    
    public static void main(String[] args){
        GambarSegiTiga panelGambar = new GambarSegiTiga();
        JFrame frameGambar = new JFrame("Gambar Polyline");
            frameGambar.setSize(400, 400);
        panelGambar.setBackground(Color.WHITE);
            frameGambar.setContentPane(panelGambar);
        frameGambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frameGambar.setVisible(true);
    }
}
