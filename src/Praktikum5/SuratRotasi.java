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
    MyCancas ferzha;
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
    }
}
