package Praktikum5;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */


import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.geom.Line2D;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;


public class SuratRotasi extends JPanel{
    MyCanvas ferzha;
    JSlider sliderTransX, sliderTransY, sliderRotateSudut, sliderRotateX, sliderRotateY;
    double transX = 0.0;
    double transY = 0.0;
    double rotateSudut = 0.0;
    double rotateX = 500.0;
    double rotateY = 250.0;
    double scaleX = 1.0;
    double scaleY = 1.0;
    float width = 2.0f;
    public SuratRotasi(){
        super(new BorderLayout());
        //pengaturan Tampilan Slider
        JPanel controlPanel = new JPanel(new GridLayout(3,3));
        add(controlPanel, BorderLayout.NORTH);
        controlPanel.add(new JLabel("Translasi Gambar (dx, dy) : "));
        sliderTransX = setSlider(controlPanel, JSlider.HORIZONTAL, 0, 900, 150, 100, 50);
        sliderTransY = setSlider(controlPanel, JSlider.HORIZONTAL, 0, 400, 150, 100, 50);
        controlPanel.add(new JLabel("Rotasi Gambar (ox, oy) : "));
        sliderRotateSudut = setSlider(controlPanel, JSlider.HORIZONTAL, 0, 360, 0, 30, 45);
        JPanel subPanel = new JPanel();
        subPanel.setLayout(new GridLayout(1, 2));
        sliderRotateX = setSlider(subPanel, JSlider.HORIZONTAL, 0, 600, 600, 150, 50);
        sliderRotateY = setSlider(subPanel, JSlider.HORIZONTAL, 0, 600, 300, 150, 50);
        controlPanel.add(subPanel);
        controlPanel.add(new JLabel());
        controlPanel.setBackground(Color.MAGENTA);
        JPanel widthPanel = new JPanel();
        widthPanel.setLayout(new GridLayout(1, 2));
            add(widthPanel, BorderLayout.SOUTH);
        ferzha = new MyCanvas();
        add(ferzha, "Center");     
    }
    public JSlider setSlider(JPanel panel, int orientation, int minimumValue,
            int maximumValue, int initValue, int majorTickSpacing,
            int minorTickSpacing){
        JSlider slider = new JSlider(orientation, minimumValue, maximumValue, initValue);
        slider.setPaintTicks(true);
        slider.setMajorTickSpacing(majorTickSpacing);
        slider.setMinorTickSpacing(minorTickSpacing);
        slider.setPaintLabels(true);
        slider.addChangeListener(new ChangeListener(){
            public void stateChanged(ChangeEvent e){
                JSlider tempSlider = (JSlider) e.getSource();
                if(tempSlider.equals(sliderTransX)){
                    transX = sliderTransX.getValue() - 150.0;
                    ferzha.repaint();
                }else if (tempSlider.equals(sliderTransY)){
                    transY = sliderTransY.getValue() - 150.0;
                    ferzha.repaint();
                }else if (tempSlider.equals(sliderRotateSudut)){
                    rotateSudut = sliderRotateSudut.getValue() * Math.PI / 180;
                    ferzha.repaint();
                }else if (tempSlider.equals(sliderRotateX)){
                    rotateX = sliderRotateX.getValue();
                    ferzha.repaint();
                }else if (tempSlider.equals(sliderRotateY)){
                    rotateY = sliderRotateY.getValue();
                    ferzha.repaint();
                }
            }
        });
        panel.add(slider);
        return slider;
    }
    
    class MyCanvas extends Canvas{
        public void paint(Graphics g){
            Graphics2D g2D = (Graphics2D) g;
   //Gambar Grafik asli
   g2D.setPaint(Color.red);
   g2D.setStroke(new BasicStroke( 2.0f ));
   g2D.draw(new Line2D.Double(200, 300, 200, 200));
   g2D.draw(new Line2D.Double(200, 200, 250, 150));
   g2D.draw(new Line2D.Double(250, 150, 300, 200));
   g2D.draw(new Line2D.Double(300, 200, 200, 200));
   g2D.draw(new Line2D.Double(200, 200, 300, 300));
   g2D.draw(new Line2D.Double(300, 300, 200, 300));
   g2D.draw(new Line2D.Double(200, 300, 300, 200));
   g2D.draw(new Line2D.Double(300, 200, 300, 300));
   g2D.setPaint(Color.MAGENTA);
   g2D.setStroke(new BasicStroke (8.0f));
   g2D.draw(new Line2D.Double(rotateX, rotateY, rotateX, rotateY));
         //Pengaturan Letak Gambar Grafik Setelah Slider Digeser
         g2D.translate(transX, transY);
         g2D.rotate(rotateSudut, rotateX, rotateY);
         g2D.scale(scaleX, scaleY);
         BasicStroke stroke = new BasicStroke(width);
         g2D.setStroke(stroke);
         g2D.setPaint(Color.BLACK);
         drawHome(g2D);
        }
        public void drawHome(Graphics2D g2D){
            //Pendefinisian Gambar Grafik yang akan dieksekusi
            Line2D line1 = new Line2D.Float(200f, 300f, 200f, 200f);
            Line2D line2 = new Line2D.Float(200f, 200f, 250f, 150f);
            Line2D line3 = new Line2D.Float(250f, 150f, 300f, 200f);
            Line2D line4 = new Line2D.Float(300f, 200f, 200f, 200f);
            Line2D line5 = new Line2D.Float(200f, 200f, 300f, 300f);
            Line2D line6 = new Line2D.Float(300f, 300f, 200f, 300f);
            Line2D line7 = new Line2D.Float(200f, 300f, 300f, 200f);
            Line2D line8 = new Line2D.Float(300f, 200f, 300f, 300f);
            g2D.draw(line1);
            g2D.draw(line2);
            g2D.draw(line3);
            g2D.draw(line4);
            g2D.draw(line5);
            g2D.draw(line6);
            g2D.draw(line7);
            g2D.draw(line8);
        }
    }
    
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setTitle("Tugas GRAFIKOM : membuat gambar surat");
        f.getContentPane().add(new SuratRotasi());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setSize(1200, 700);
        f.setVisible(true);
    }
}
