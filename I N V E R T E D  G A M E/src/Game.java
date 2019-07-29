
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.FileInputStream;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KAROL
 */
public class Game extends JPanel {
    
    private BufferedImage fundoFase1;

    private Plataforma plataforma;
   
    
    public Game(){
        
        setLayout(null);
        
        try {
            fundoFase1 = ImageIO.read(new FileInputStream("src/imagens/fase1.jpg"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    
        setSize(760, 428);
        setVisible(true);
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        
        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(fundoFase1, 0, 0, getWidth()-20, getHeight()-30, null);
    
        plataforma= new Plataforma(50, 150, 50, 38, 0, 0, true);
        plataforma.draw(g);
        
    }
    
}
