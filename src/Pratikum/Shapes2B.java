package Pratikum;

/**
 *
 * @author nurul arifin 19MI0016
 */





import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.awt.geom.*;
public class Shapes2B extends JPanel{
    public void paint(Graphics g)
    {
        super.paint(g);
        //cara lebih sederhana daripda memanggil lineTo berkali-kali maka nilainya dimasukan ke array
        int xPoints[] = {55, 67, 109,  73, 83, 55, 27, 37, 1, 43}; //ingat kembali pelajaran array di struktur data
        int yPoints[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36}; //ingat kembali pelajaran array di struktur data
        Graphics2D g2d = (Graphics2D) g;
        //create a star from a series of points
        GeneralPath star = new GeneralPath();
        //set the initial coordinate of the General Path
        star.moveTo(xPoints[0], yPoints[0]);
        //create the star--this does not draw the star
        for(int k=1; k<xPoints.length; k++)
            star.lineTo(xPoints[k], yPoints[k]);
        //close the shape
        star.closePath(); //lakukan ini jika gambar anda ingin diwarnai
        //tranlate the origin
        //Dimension d = getSize();
        g2d.translate(10, 0);
        //draw the outline
        g2d.draw(star);
        
        g2d.translate(150,0);
        g2d.fill(star); //default fill hitam
        
        g2d.translate(-150,150);
        g2d.setPaint(Color.pink);
        Stroke stroke = new BasicStroke(4, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND);
        g2d.setStroke(stroke);
        g2d.draw(star);
        
        g2d.translate(150,0);
        g2d.setPaint(Color.blue);
        g2d.fill(star); //perhatikan kita gunakan fill untuk mewarnai dalam bintang
        g2d.setPaint(Color.orange);
        g2d.draw(star); //untuk garisnya kita gunakan draw
    }
    
    public static void main(String arrgs[])
    {
        JFrame frame = new JFrame("General Path Template");
        JPanel panel = new Shapes2B();
        frame.setSize(300, 300);
        Container c = frame.getContentPane();
        c.setBackground(Color.yellow);
        c.add(panel);
        frame.show();
        frame.addWindowListener(
      new WindowAdapter(){
          public void windowClosing(WindowEvent e)
          {
              System.exit(0);
          }
      }
        );
    }
    
}
