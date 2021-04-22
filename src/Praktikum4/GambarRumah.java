package Praktikum4;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GambarRumah{
    public static void main(String[] args){
        try {
            BufferedImage img = new BufferedImage(800, 400, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) img.createGraphics();
            g2d.setPaint(Color.YELLOW); 
            g2d.fillRect(0, 0, img.getWidth(), img.getHeight());
            //atap kanan
            g2d.setColor(Color.orange);
            int sisiatap = 0;
                while(sisiatap <= 100){
                    g2d.fillRect(400+sisiatap, 80+sisiatap, 5, 150);
                    sisiatap++;
                }
            //atap kiri
            g2d.setColor(Color.orange);
            int sisiatap1 = 0;
                while(sisiatap1 <= 100){
                    g2d.fillRect(400-sisiatap1, 80+sisiatap1, 5, 150);
                    sisiatap1++;
                }
            //titik putus
            g2d.setColor(Color.red);
            g2d.fillRect(400, 90, 2, 10);
            g2d.fillRect(400, 110, 2, 10);
            g2d.fillRect(400, 130, 2, 10);
            g2d.fillRect(400, 150, 2, 10);
            g2d.fillRect(400, 170, 2, 10);
            g2d.fillRect(400, 190, 2, 10);
            //tembok menurun
            g2d.setColor(Color.red);
            int lurus = 0;
                while (lurus <= 150){
                    g2d.fillRect(500, 180+lurus, 5, 1);
                    g2d.fillRect(300, 180+lurus, 5, 1);
                    lurus++;
                }
            //tembok mendatar
            g2d.setColor(Color.blue);
            g2d.fillRect(305, 185, 195, 150);
            g2d.setColor(Color.red);
            int lurus1 = 0;
                while (lurus1 <= 200){
                    g2d.fillRect(300+lurus1, 180, 5, 5);
                    g2d.fillRect(300+lurus1, 330, 5, 5);
                    lurus1++;
                }
            //palang pintu atas
            g2d.setColor(Color.lightGray);
            g2d.fillRect(400, 250, 55, 80);
            g2d.setColor(Color.orange);
            int luruspintu = 0;
                while (luruspintu <= 50){
                    g2d.fillRect(400+luruspintu, 250, 5, 5);
                    luruspintu++;
                }
            //kaki pintu
            g2d.setColor(Color.orange);
                int luruspintu1 = 0;
                    while (luruspintu1 <= 75){
                        g2d.fillRect(400, luruspintu1+250, 5, 5);
                        g2d.fillRect(450, luruspintu1+250, 5, 5);
                        luruspintu1++;
                    }
            //palang jendela atas bawah
            g2d.setColor(Color.black);
            g2d.fillRect(310, 250, 85, 50);
            g2d.setColor(Color.orange);
            int lurusjendela = 0;
                while (lurusjendela <=75){
                    g2d.fillRect(310+lurusjendela, 250, 5, 5);
                    g2d.fillRect(310+lurusjendela, 300, 5, 5);
                    lurusjendela++; 
                }
            //palang jendela kiri kanan
            g2d.setColor(Color.orange);
                int lurusjendela1 = 0;
                while (lurusjendela1 <=50){
                    g2d.fillRect(310, 250+lurusjendela1, 5, 5);
                    g2d.fillRect(390, 250+lurusjendela1, 5, 5);
                    lurusjendela1++; 
                }
            
            //letak file sesuaikan dengan nama folder Anda masing-masing
            File outfile = new File("C:/Users/PC/Documents/NetBeansProjects/GrafikaKomputer/src/Praktikum4GambarRumah.png");
            ImageIO.write(img, "png", outfile);
        } catch (IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
