package Praktikum8;

/**
 *
 * @NURUL ARIFIN 19MI0016
 *
 */




import javax.swing.*;
public class AnimasiAwan extends Thread implements Runnable {   
    JPanel panel;
    int ordinat = 800;

    public int getOrdinat() {
        return ordinat;
    }
    public final int mulai = 100;
    int kode;

    public AnimasiAwan(JPanel panel, int kode) {
        this.panel = panel;
        this.kode = kode;
    }
    @Override
    public void run() {
        while (true) {
            if (kode==mulai)
                ordinat-=5;
            if (ordinat<=-500)
                ordinat=kode;
            
            try {
                Thread.sleep(100);
            } catch (Exception e) {
                e.printStackTrace();
            }
            panel.repaint();
        }
    }
}
