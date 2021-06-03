package Praktikum8;

/**
 *
 * @NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.*;
import java.awt.font.*;
import java.awt.geom.*;
import javax.swing.*;
public class Human2D extends JApplet{
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Human 2D");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JApplet applet = new JApplet();
        applet.init();
        frame.getContentPane().add(applet);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
    @Override
    public void init(){
        JPanel panel = new PanelHuman();
        getContentPane().add(panel);
    }
}

class PanelHuman extends JPanel implements Runnable{
    //inisialisasi koordinat orang
    int xHuman = -500, yHuman = 100, vHuman = 1;
    //inisialisasi koordinat awan
    int mulai = 100;
    //memanggil kelas thread
    AnimasiOrang2 orang = new AnimasiOrang2(this, xHuman, yHuman, vHuman);
    AnimasiAwan awan = new AnimasiAwan(this, mulai);
    PanelHuman(){
        setPreferredSize(new Dimension(1000,600));
        setBackground(Color.white);
        //membuat thread
        Thread thread = new Thread(this);
        //memulai thread
        thread.start();
        orang.start();
        awan.start();
    }
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        drawLangit(g2, 0, 0);
        drawRumput(g2, 0, 300);
        drawSemak(g2, 650, 300);
        //getter koordinat orang
        xHuman = orang.getX();
        yHuman = orang.getY();
        vHuman = orang.getV();
        drawHuman(g2, xHuman, yHuman, vHuman);
        //getter koordinat awan
        mulai = awan.getOrdinat();
        drawAwan(g2, 380 + mulai, 70);
        drawTulisan(g2, 50, 570);
    }
    
    //method menggambar awan
    public void drawAwan(Graphics2D g2, int x, int y){
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(2.0f));
        GeneralPath gp = new GeneralPath();
        gp.moveTo(x, y);
        gp.curveTo(x, y, x+20, y-30, x+40, y);
        gp.curveTo(x+40, y, x+60, y-30, x+80, y);
        gp.curveTo(x+80, y, x+130, y+20, x+80, y+40);
        gp.curveTo(x+80, y+40, x+60, y+60, x+40, y+40);
        gp.curveTo(x+40, y+40, x+20, y+60, x, y+40);
        gp.curveTo(x, y+40, x-50, y+20, x, y);
        g2.setColor(Color.white);
        g2.draw(gp);
        g2.fill(gp);
    }
    
    //method menggambar rumput
    public void drawRumput(Graphics2D g2, int x, int y){
        Rectangle2D.Double rumput = new Rectangle2D.Double(x, y, 1000, 300);
        g2.setColor(Color.GREEN);
        g2.fill(rumput);
    }
    
    //method menggambar jalan
    public void drawJalan(Graphics2D g2, int x, int y){
        Rectangle2D.Double jalan = new Rectangle2D.Double(x, y, 1000, 150);
        g2.setColor(new Color(224, 147, 18));
        g2.fill(jalan);
    }
    
    //method menggambar langit
    public void drawLangit(Graphics2D g2, int x, int y){
        Rectangle2D.Double langit = new Rectangle2D.Double(x, y, 1000, 300);
        g2.setPaint(warna);
        g2.fill(langit)
    }
    
    //method menggambar orang
    public void drawHuman(Graphics2D g2, int x, int y, int v){
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2.setStroke(new BasicStroke(15, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND));
        //gambar 1
        Ellipse2D.Double head = new Ellipse2D.Double(x+300, y+100, 50, 50);
        GeneralPath gp = new GeneralPath();
        gp.moveTo(x+325, y+150);
        gp.lineTo(x+325, y+170);
        gp.lineTo(x+300, y+200);
        gp.lineTo(x+305, y+230);
        gp.moveTo(x+325, y+170);
        gp.lineTo(x+345, y+210);
        gp.lineTo(x+365, y+225);
        gp.moveTo(x+325, y+170);
        gp.lineTo(x+325, y+240);
        gp.lineTo(x+315, y+280);
        gp.lineTo(x+295, y+310);
        gp.lineTo(x+305, y+310);
        gp.lineTo(x+325, y+240);
        gp.lineTo(x+360, y+310);
        gp.lineTo(x+370, y+310);
        //gambar 2
        Ellipse2D.Double head2 = new Ellipse2D.Double(x+300, y+100, 50, 50);
        GeneralPath gp2 = new GeneralPath();
        gp2.moveTo(x+325, y+150);
        gp2.lineTo(x+325, y+170);
        gp2.lineTo(x+310, y+200);
        gp2.lineTo(x+305, y+230);
        gp2.moveTo(x+325, y+170);
        gp2.lineTo(x+335, y+210);
        gp2.lineTo(x+345, y+230);
        //kaki kiri
        gp2.moveTo(x+325, y+240);
        gp2.lineTo(x+325, y+310);
        gp2.lineTo(x+335, y+310);
        g2.setColor(Color.red);
        if(v==1){
            g2.draw(head);
            g2.fill(head);
            g2.draw(gp);
        }else{
            g2.draw(head2);
            g2.fill(head2);
            g2.draw(gp2);
        }
    }
    
}