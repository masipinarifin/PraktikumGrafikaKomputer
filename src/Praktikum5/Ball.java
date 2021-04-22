package Praktikum5;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.*;
import java.awt.event.*;
import java.awt.font.FontRenderContext;
import java.awt.font.GlyphVector;
import java.awt.geom.*;
import java.util.*;
import javax.swing.*;
public class Ball extends JFrame{
    public static void main(String[] args) {
        new Ball();
    }
public Ball(){
    this.setSize(500,500); //membuat windows
    this.setTitle("Nurul Arifin"); //membuat judul
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.add(new PaintSurface(),BorderLayout.CENTER);
    Thread t=new AnimationThread(this); // menjalankan thread terhadap variabel
    t.start();
    this.show();
    }
}
class AnimationThread extends Thread{
    JFrame c;
public AnimationThread(JFrame c){
    this.c=c;
}
public void run(){
    while(true){
        c.repaint();
        try{
            Thread.sleep(30);//Frame Gambar Perdetik
        }
        catch(InterruptedException ex){
        }
    }
}
}
class PaintSurface extends JComponent{
    double x_p=100;
    double y_p=100;
    int rotation=0;
    double angle = 0;
    public void paint(Graphics g){
        Graphics2D g2 = (Graphics2D) g;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setPaint(new GradientPaint(20,0,Color.green,0,getHeight(),Color.ORANGE)); //warna bg gradasi
        g2.fillRect(0,0,getWidth(),getHeight());
        Shape ellipse = new Ellipse2D.Double(150,100,200,200);
        GradientPaint paint= new GradientPaint(100,100,Color.WHITE,400,400,Color.GRAY);
        g2.setPaint(paint);
        g2.fill(ellipse);
        AlphaComposite ac=AlphaComposite.getInstance(AlphaComposite.SRC_OVER,(float)0.4f);
        g2.setComposite(ac);
        g2.setColor(Color.blue);//pewarnaan kata
        Font font = new Font("Serif",Font.BOLD,120);//pengaturan font untuk huruf
        g2.setFont(font);
        g2.drawString("hallo", 120, 200); //penulisan huruf rio dan tata letak
        FontRenderContext frc = g2.getFontRenderContext();
        GlyphVector gv=font.createGlyphVector(frc, "2D");//penulisan 2D
        Shape glyph = gv.getOutline(150,300);//letak vertikal tulisan 2D
        g2.rotate(Math.PI/6,200,300);//letak horisontal posisi tulisan 2D
        g2.fill(glyph);
        if(rotation==360){ //rotasi 2D
            rotation=0;
        }
        else {
            rotation+=10; //Pertambahan percepatan rotasi
            angle-=0.05;
            x_p=100*Math.cos(angle)+200;//merevolusi obyek
            y_p=100*Math.sin(angle)+200;
        }
        Shape ball=new Ellipse2D.Float ((int)x_p,(int)y_p,50,20);//fungsi membentuk ellips
        g2.rotate(Math.toRadians(rotation),x_p+50/2,y_p+10/2);//merotasi obyek
        g2.setColor(Color.magenta);//memberi gambar obyek
        g2.fill(ball);//menggambar ball yang memutar
    }
}

