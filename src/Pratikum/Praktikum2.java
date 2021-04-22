package Pratikum;

/**
 *
 * @author nurul arifin 19MI0016
 */






import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Shape;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Praktikum2 extends JPanel {
    public void gambar(Graphics g)
    {
        Graphics2D g2d = (Graphics2D) g;
        Shape s1 = new Ellipse2D.Double(0,0,100,100);
        Shape s2 = new Ellipse2D.Double(60,0,100,100);
        /*Catatan :
        Hasil dari operasi-operasi tersebut disimpan pada objek Area yang aktif saat ini.
        Objek area yang dikirimkan pada parameter method tidak akan berubah akibat pemanggilan operasi tersebut.
        Baris pertama menggambarkan dua bentuk pertama. Baris di bawahnya menggambarkan hasil kombinasi menggunakan
        keempat operasi (add, intersect, subtract, exclusiveOr) menghasilkan empat bentuk baru.
        */
        //membuat objek pertama 2 lingkaran tidak diarsir
        g2d.translate(20, 50);
        g2d.draw(s1);
        g2d.draw(s2);
        g2d.translate(0,200);
        
        //tambahkan class area untuk mengarsir
        Area a1 = new Area(s1);
        Area a2 = new Area(s2);
        a1.add(a2); //tambahkan area1 dengan area2
        g2d.fill(a1); //print gambar area1 yang telah ditambahkan dengan area2
        
        g2d.translate(180, 0); //pindahkan titik menggambar selanjutnya dengan x=180 ke kanan ingat)
        a1 = new Area(s1); // buat objek baru ke 3 dengan area1
        a1.intersect(a2); //potongan/irisan antara a1 dan a2
        g2d.fill(a1); //cetak hasil potongannya area yang merupakan potongan
        
        g2d.translate(180, 0);
        a1 = new Area(s1); // buat objek baru ke 4 dengan area1
        a1.subtract(a2); //kurangi potongan area a1 dengan a2
        g2d.fill(a1); //cetak hasil pengurangannya
        
        g2d.translate(180, 0);
        a1 = new Area(s1); // buat objek baru ke 5 dengan area1
        a1.exclusiveOr(a2); //kurangi potongan/irisan area a1 dan a2
        g2d.fill(a1); //cetak hasil potongannya area yang merupakan potongan        
    }

@Override
public void paintComponent(Graphics g){
    clear(g);
    gambar(g);
}
protected void clear(Graphics g){
    super.paintComponent(g);
}
public static void main(String[] args){
    Praktikum2 panelGambar = new Praktikum2();
    JFrame frameGambar = new JFrame("Gambar 2 Lingkaran");
        frameGambar.setSize(800, 400);
    panelGambar.setBackground(Color.white);
        frameGambar.setContentPane(panelGambar);
    frameGambar.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frameGambar.setVisible(true);
}
/*Catatan:
dua buah lingkaran yang saling berpotongan, sebutlah a1 dan a2, digunakan sebagai bentuk asal.
Kedua bentuk tersebut digambarkan pada baris pertama gambar. Dari kedua bentuk tersebut,
dibentuklah objek area a1 dan a2 (baris 36-37). Empat operasi (add, intersect, subtract, exclusiveOr)
kemudian diterapkan pada kedua objek Area. Hasilnya digambarkan pada baris bawah gambar (baris 42-55).
Karena class Area mengimplementasikan infterface Shape, objek Area dapat secara langsung dikirimkan sebgai
parameter method fill dari objek Graphics2D
*/
}
