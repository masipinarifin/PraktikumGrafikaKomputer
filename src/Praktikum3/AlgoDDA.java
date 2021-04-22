package Praktikum3;

/**
 *
 * @author PC
 * 
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AlgoDDA extends JPanel{
    //Variabel untuk menentukan x dan y
    private int x1, x2, y1, y2;
    
    //Construktor DDA
    public AlgoDDA(){
        
    }
    public void setx1(int x1){
        this.x1 = x1;
    }
    public void setx2(int x2){
        this.x2 = x2;
    }
    public void sety1(int y1){
        this.y1 = y1;
    }
    public void sety2(int y2){
        this.y2 = y2;
    }
    @Override
    public void paint(Graphics grs){
        int jmlLangkah,i;
        float x_inc, y_inc;
        int dx =  x2-x1; //mencari jarak x2 dengan x1
        int dy = y2-y1; //mencari jarak y2 dengan y1
        //dibuat atau dicasting float karena variabel akan menampung nilai desimal
        float x = x1;
        float y = y1;
        super.paint(grs); //menurunkan fungsi parent
        this.setBackground(Color.WHITE); //warna Background
        grs.setColor(Color.RED); //warna garis
        //menentukan jumlah langkah untuk perulangan
        //apabila variabel adalah bilangan negatif maka diubah menjadi bilangan positif
        //Math.abas() mengubah nilai menjadi nilai absolut
        if(Math.abs(dx)>Math.abs(dy)){
            jmlLangkah = Math.abs(dx);
        }
        else {
            jmlLangkah = Math.abs(dy);
        }
        //menentukan pertambahan nilai tiap langkah
        x_inc = dx/(float)jmlLangkah;
        y_inc = dx/(float)jmlLangkah;
        //perulangan untuk  menggambar titik
        for(i=1; i <= jmlLangkah; i++){
            //Setiap langkah, x dan y akan mengalami pertambahan sesuai increment
            x += x_inc;
            y += y_inc;
            //Menggambar atau mewarnai titik sesuai x dan y
            grs.drawRect(Math.round(x), Math.round(y), 0, 0);
        }
            
        
    }
}
