package Praktikum4;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class GambarCirclePNGBGKuning {
    public static void main(String[] args){
        try {
            BufferedImage img = new BufferedImage(400, 400, BufferedImage.TYPE_INT_RGB);
            Graphics2D g2d = (Graphics2D) img.createGraphics();
            Ellipse2D lingkaran;
            double xpusat = 100, ypusat = 100;
            double radius = 80;
            lingkaran = new Ellipse2D.Double(
                    xpusat, ypusat,
                    radius, radius
            );
            g2d.setPaint(Color.YELLOW); 
            g2d.fillRect(0, 0, img.getWidth(), img.getHeight());
            g2d.setPaint(Color.RED);
            g2d.fill(lingkaran);
            //letak file sesuaikan dengan nama folder Anda masing-masing
            File outfile = new File("C:/Users/LAPTOP-15/Documents/Nurul/Semester 4/Grafika Komputer/Pertemuan-05/lingkaran_merah_bg_kuning.png");
            ImageIO.write(img, "png", outfile);
        } catch (IOException e){
            //TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
