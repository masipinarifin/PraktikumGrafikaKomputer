package Praktikum3;

/**
 *
 * @author NURUL ARIFIN 19MI0016
 * 
 */
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class AlgoLingkaran extends JPanel{
    int xo, yo, jari2;
    public AlgoLingkaran(){}
    public void setxo(int x){xo = x;}
    public void setyo(int y){yo = y;}
    public void setjari2(int jari2){this.jari2 = jari2;}
    
    @Override
    public void paint (Graphics grs){
        int p = 1-jari2;
        int x ;
        int y = jari2;
        super.paint(grs);
        this.setBackground(Color.green);
        grs.setColor(Color.blue);
        //perulangan dari x sampai y maka
        for(x=0; x<=y; x++){
            if(p<0){
                p+=2*x+1;
            }else{
                y--;
                p+=2*(x-y)+1;
            }
            //langkah pencerminan 
            //langkah menggambar atau mewarnai pixel sesuai x dan y
            grs.drawRect(xo+x, yo+y, 1, 1);
            grs.drawRect(xo-x, yo+y, 1, 1);
            grs.drawRect(xo+x, yo-y, 1, 1);
            grs.drawRect(xo-x, yo-y, 1, 1);
            grs.drawRect(xo+y, yo+x, 1, 1);
            grs.drawRect(xo-y, yo+x, 1, 1);
            grs.drawRect(xo+y, yo-x, 1, 1);
            grs.drawRect(xo-y, yo-x, 1, 1);
            
        }
    }
}
