package Praktikum3;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 *
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AlgoBresenham extends JPanel {

    private int x1, x2, y1, y2, p, pkd0, pld0;//variabel untuk menentukan x dan y

    public AlgoBresenham() {
    } //constructor AlgoBresenham

    public void setx1(int x1) {
        this.x1 = x1;
    }

    public void setx2(int x2) {
        this.x2 = x2;
    }

    public void sety1(int y1) {
        this.y1 = y1;
    }

    public void sety2(int y2) {
        this.y2 = y2;
    }

    @Override
    public void paint(Graphics grs) {
        int x, y, endx, endy;
        int dx = Math.abs(x2 - x1); //mencari jarak x2 dengan x1
        int dy = Math.abs(y2 - y1);
        super.paint(grs); //menurunkan fungsi parent
        this.setBackground(Color.BLACK); //mewarnai background
        grs.setColor(Color.yellow); //warna garis
        //apabila jarak dx lebih dekat dari dy maka perulangan berpatokan titik x
        if (dx >= dy) {
            p = 2 * dy - dx; //awal
            pkd0 = 2 * dy; //p selanjutnya jika p<0
            pld0 = 2 * (dy - dx); // p selanjutnya jika p>0
            //endx untuk menandai batas x dan untuk akhir perulangan
            //bila xi > dari x2 maka awal pembuatan garis dimulai dari x2 (titik paling kiri menuju kanan)
            if (x1 > x2) {
                x = x2;
                y = y2;
                endx = x1;
            } else {
                x = x1;
                y = y1;
                endx = x2;
            }
            //perulangan membuat titik berpatokan x karena dx lebih besar dari dy
            while (x < endx) {
                x++;
                //bila p<0 maka x yang bertambah
                if (p < 0) {
                    p += pkd0;
                } else {
                    //jika y lebih besar dari endy maka gambar akan semakin keatas
                    //jika endy lebih besar maka gambar akan menurun ke bawah
                    if (y1 > y2) {
                        y--;
                    } else {
                        y++;
                    }
                    p += pld0;
                }
                grs.drawRect(x, y, 0, 0); //menggambar titik sesuai x dan y, 0 adalah tebal garis
            }
        } //perulangan berpatokan sumbu y karena dy lebih besar
        else {
            p = 2 * dx - dy; //p awal
            pkd0 = 2 * dx; // p selanjutnya jika p<0
            pld0 = 2 * (dx - dy); // p selanjutnya jika p>0
            //menentukan x, y, dan end y untuk menandai batas y
            //bila x1 > dari x2 maka awal pembuatan garis dimulai dari x2 (titik paling kiri menuju kanan)
            if (y1 > y2) {
                x = x2;
                y = y2;
                endy = y1;
            } //karena y2 lebih besar dari y1
            else {
                x = x1;
                y = y1;
                endy = y2;
            }
            //perulangan membuat titik berpatokan y karena dy lebih besar dari dx
            while (y < endy) {
                y++;
                if (p < 0) {
                    p += pkd0;
                } else {
                    //jika x lebih besar dari endx maka gambar akan semakin keatas
                    //jika endx lebih besar maka gambar akan menurun kebawah
                    if (x1 > x2) {
                        x--;
                    } else {
                        x++;
                    }
                    p += pld0;
                }
                grs.drawRect(x, y, 0, 0); //menggambar titik sesuai x dan y
            }
        }

    }
}
