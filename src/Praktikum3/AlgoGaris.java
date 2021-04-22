package Praktikum3;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */

import java.awt.*;
import javax.swing.*;

public class AlgoGaris {
    public static void main (String[] args){
        //membuat objek baru dengan judul "Algoritma Garis"
        JFrame frame = new JFrame("Algoritma membuat garis");
        //Menghentikan program saat kita menekan tombol close
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //membuat objek
        AlgoDDA dda = new AlgoDDA();
        AlgoBresenham brs = new AlgoBresenham();
        AlgoLingkaran o = new AlgoLingkaran();
        //set x dan y DDA
        dda.setx1(0);
        dda.sety1(1);
        dda.setx2(5);
        dda.sety2(7);
        
        //set x dan y bresenham
        brs.setx1(0);
        brs.sety1(1);
        brs.setx2(5);
        brs.sety2(7);
        
        //set x dan y lingkaran
        o.setxo(120);
        o.setyo(120);
        o.setjari2(100);
        
        //membuat frame
        frame.add(dda);
        frame.add(brs);
        frame.add(o);
        
        //membagi tampilan menjadi 3
        frame.setLayout(new GridLayout(1,3));
        //mengatur ukuran dan letak frame di layar
        frame.setBounds(450, 100, 700, 400);
        //mengatur icon frame jika ingin mengganti bisa gunakan script berikut
        //image icon = Toolkit.getDefaultToolkit().getImage("icons.png");
        //frame.setIconImage(icon);
        //Aktifkan untuk membuat Frame terlihat atau visible
        frame.setVisible(true);
        //untuk mengaktifkan button maximize pada Frame
        frame.setResizable(true);
        
    }
}
