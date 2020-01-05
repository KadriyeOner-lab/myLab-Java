
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

 class Ates{
    
    private int x;
    private  int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Ates(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
public class Oyun extends  JPanel implements KeyListener, ActionListener{
        Timer timer = new Timer(5, this);

    private int gecenSure=0;
     private int harcananAtes=0;
     private BufferedImage image;
     private ArrayList<Ates> atesler = new ArrayList<Ates>();
     
     private int atesdirX = 1;
       private int atesdirY = 1;
     private int topX = 0;
     private int topdirX = 5;
      private int uzayGemisiX = 0;
       private int dirUzayX = 20;

       public boolean kontrolEt(){
           for (Ates ates : atesler) {
               if (new Rectangle(ates.getX(), ates.getY(), 10,20).intersects(new Rectangle(topX, 0, 20, 20))) {
                  alkısEkle();
                  return true;
                   
                   
               }
               
           }
           return false;
           
       }
    public Oyun() {
        
        try {
            image = ImageIO.read(new FileInputStream(new File("indir.png")));
        } 
    catch (IOException ex) {
            Logger.getLogger(Oyun.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        setBackground(Color.BLACK);
        timer.start();
    }
    public void alkısEkle(){
        try {
            AudioInputStream stream = AudioSystem.getAudioInputStream(new File("alkış.wav"));
            Clip clip = AudioSystem.getClip();
            clip.open(stream);
            clip.start();
            
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(OyunEkranı.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(OyunEkranı.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(OyunEkranı.class.getName()).log(Level.SEVERE, null, ex);
        }
    
}

    @Override
    public void repaint() {
        super.repaint(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g); 
        gecenSure += 5;
    g.setColor(Color.red);
    g.fillOval(topX, 0, 20, 20);
    g.drawImage(image, uzayGemisiX, 490, image.getWidth()/5, image.getHeight()/5,this);
    for (Ates atesler1 : atesler) {
            if (atesler1.getY() < 0) {
                atesler.remove(atesler1);               
                
            }
            
        }
    g.setColor(Color.BLUE);
        for (Ates ates : atesler) {
            g.fillRect(ates.getX(), ates.getY(),10,20);
            
        }
        if (kontrolEt()) {
            timer.stop();
            String message = "Kazandınız..\n"
                    + "Harcanan Ates: "+ harcananAtes+ 
                    "\nGeçen Süre:"+ gecenSure/1000.0+ "saniye";
            JOptionPane.showMessageDialog(this, message);
            System.exit(0);
                    
                    
            
            
        }
    }

    
    
     
     
    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int c = e.getKeyCode();
        if (c == KeyEvent.VK_LEFT) {
            if (uzayGemisiX <= 0) {
                uzayGemisiX = 0;
                
            }
            else{
                uzayGemisiX -= dirUzayX;
            }
            
        }
        else if (c == KeyEvent.VK_RIGHT) {
           
          if (uzayGemisiX >= 760) {
          uzayGemisiX = 760;  
        }
          else{
              uzayGemisiX += dirUzayX;
          }
          
          

}
        else if (c == KeyEvent.VK_CONTROL) {
            atesler.add(new Ates(uzayGemisiX+15, 490));
            harcananAtes++;
            
            
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        for (Ates ates : atesler) {
            ates.setY(ates.getY()- atesdirY);
            
        }
        topX += topdirX;
        if (topX >= 780) {
            topdirX = -topdirX;
            
        }
        if (topX<=0) {
          topdirX = -topdirX;  
        }
        repaint();
    }
    
    
    
}
