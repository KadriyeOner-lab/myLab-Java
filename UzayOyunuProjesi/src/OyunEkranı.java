
import java.awt.HeadlessException;
import java.awt.event.KeyListener;
import javax.swing.JFrame;



public class OyunEkranı extends  JFrame{
    public static void main(String[] args) {
        
        
        OyunEkranı ekran = new OyunEkranı("Oyun ekranına hoşgeldiniz..");
        
        ekran.setResizable(false);
        ekran.setFocusable(false);
        ekran.setSize(800,600);
        
        ekran.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Oyun oyun = new Oyun();
        oyun.requestFocus();
        oyun.addKeyListener(oyun);
        oyun.setFocusable(true);
        oyun.setFocusTraversalKeysEnabled(false);
        ekran.add(oyun);
        ekran.setVisible(true);
       
        
    }

    public OyunEkranı(String title) throws HeadlessException {
        super(title);
    }

    
    
}
