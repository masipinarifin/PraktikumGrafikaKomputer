package Praktikum8;

/**
 *
 * @NURUL ARIFIN 19MI0016
 * 
 */
import javax.swing.*;
public class AnimasiOrang2 extends Thread implements Runnable {
    JPanel panel;
    int x, y, v;
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public int getV(){
        return v;
    }
    public AnimasiOrang2(JPanel panel, int x, int y, int v){
        this.panel = panel;
        this.x = x;
        this.y = y;
        this.v = v;
    }
    @Override
            public void run(){
                while (true){
                    //
                    if(x < 1000){
                        if(v == 1){
                            x = x + 15;
                            v = 2;
                        }else{
                            x = x + 15;
                            v = 1;
                        }
                    }else{
                        x = -400;
                    }
                    //
                    try{
                        //untuk mengatur kecepatan thread, semakin kceil nilai semakin cepat
                        Thread.sleep(300);
                    }catch(Exception e){
                        
                    }
                    panel.repaint();
                }
            }
}
