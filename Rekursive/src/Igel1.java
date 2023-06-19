import javax.swing.*;
import java.awt.*;


public class Igel1 extends JPanel {


    int xa = 400; // koordinati nagore
    int ya = 400; // koordinati nadole
    double phi = 13; // nakriveno na desno
    double b = 0;
    double Winkel = 90;


    public void draw(Graphics g, int length){
        g.setColor(Color.black);
        int dx = (int) (length * Math.sin(b));
        int dy = (int) (length * Math.cos(b));
        int xe = xa + dx;
        int ye = ya - dy;
        g.drawLine(xa, ya, xe, ye);
        xa = xe;
        ya = ye;
    }

    public void Zeichne(double winkel){
        phi += winkel;
        b = 2 * Math.PI * phi / 360;
    }
    
   

    public void rechts(double i){
        Winkel -= i;
        if(Winkel < 0){
            Winkel = 360 + Winkel;
        }
    }
    
    public void vor(double l){
        Winkel += l;
        if(Winkel > 0){
            Winkel = 360 + Winkel;
        }
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponents(g);
        int n = 4;
        for(int i = 0; i < n;i++){
            draw(g,110);
            Zeichne(360.0/n);
            
           
        }for(double phi = 10; phi< 360; phi=phi+10) {
        	   draw(g,110);
        	   Zeichne(360.0/n);
           }
    }
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(1000,1000);
        frame.setResizable(false);
        frame.add(new Igel1());
        frame.setVisible(true);
        frame.setBackground(new Color(220,150,190));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

}



